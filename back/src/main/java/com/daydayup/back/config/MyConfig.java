package com.daydayup.back.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author FL
 */
public class MyConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //设置编码器
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        //使用内存用户信息，方便测试
        auth.inMemoryAuthentication().passwordEncoder(encoder)
                .withUser("lisi").password(encoder.encode("lisis")).roles("vip");
    }

}