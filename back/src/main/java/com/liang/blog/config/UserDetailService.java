package com.liang.blog.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailService {


    /**
     * 加载用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
