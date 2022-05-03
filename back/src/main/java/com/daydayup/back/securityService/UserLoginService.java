package com.daydayup.back.securityService;


import com.daydayup.back.entity.Authority;
import com.daydayup.back.entity.User;
import com.daydayup.back.securityService.read.AuthorityService;
import com.daydayup.back.service.read.UserReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * @author FL
 */
public class UserLoginService {

    @Autowired
    private UserReadService userReadService;

    @Autowired
    private AuthorityService authorityService;

    @Autowired
    private RedisTemplate redisTemplate;

    //查询用户名登录信息
    public User getUser(String username){
        User currentUser = null;
        Object o = redisTemplate.opsForValue().get("user_"+username);
        if(o!=null){
            currentUser= (User) o;
        }else {
            currentUser = userReadService.getUserByName(username);
            if(currentUser !=null){
                redisTemplate.opsForValue().set("user_"+username,currentUser);
            }
        }
        return currentUser;
    }

    //查询用户权限
    public List<Authority> getUserAuthority(String username){
        List<Authority> authorities = null;
        Object o = redisTemplate.opsForValue().get("authorities_"+username);
        if(o!=null){
            authorities = (List<Authority>) o;
        }else {
            authorities = authorityService.getAuthoritiesByUsername(username);
            if(authorities.size()>0){
                redisTemplate.opsForValue().set("authorities_"+username,authorities);
            }
        }
        return authorities;
    }

}
