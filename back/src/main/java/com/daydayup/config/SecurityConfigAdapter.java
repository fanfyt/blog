package com.daydayup.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * @author FL
 */
@EnableWebSecurity
public class SecurityConfigAdapter extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //设置编码器
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        //使用内存用户信息，方便测试
        auth.inMemoryAuthentication().passwordEncoder(encoder)
                .withUser("fl").password(encoder.encode("fl")).roles("admin").and()
                .withUser("xz").password(encoder.encode("xz")).roles("admin").and()
                .withUser("xm").password(encoder.encode("xm")).roles("admin");
    }

}
