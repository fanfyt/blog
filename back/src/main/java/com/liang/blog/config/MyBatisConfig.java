package com.liang.blog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liang
 */
@Configuration
@MapperScan("com.liang.blog.mapper")
public class MyBatisConfig {
    // MyBatis 配置
}
