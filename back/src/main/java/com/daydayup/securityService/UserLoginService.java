package com.daydayup.securityService;


import com.daydayup.entity.Authority;
import com.daydayup.entity.User;
import com.daydayup.securityService.read.AuthorityService;
import com.daydayup.service.read.UserReadService;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FL
 */
public class UserLoginService {

    @Resource
    private UserReadService userReadService;

    @Resource
    private AuthorityService authorityService;

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 查询用户名登录信息
     */
    public User getUser(String username) {
        User currentUser = null;
        Object o = redisTemplate.opsForValue().get("user_" + username);
        if (o != null) {
            currentUser = (User) o;
        } else {
            currentUser = userReadService.getUserByName(username);
            if (currentUser != null) {
                redisTemplate.opsForValue().set("user_" + username, currentUser);
            }
        }
        return currentUser;
    }

    /**
     * 查询用户权限
     */
    public List<Authority> getUserAuthority(String username) {
        List<Authority> authorities;
        Object o = redisTemplate.opsForValue().get("authorities_" + username);
        if (o != null) {
            authorities = (List<Authority>) o;
        } else {
            authorities = authorityService.getAuthoritiesByUsername(username);
            if (authorities.size() > 0) {
                redisTemplate.opsForValue().set("authorities_" + username, authorities);
            }
        }
        return authorities;
    }

}
