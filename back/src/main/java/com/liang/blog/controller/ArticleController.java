package com.liang.blog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liang.blog.po.Article;
import com.liang.blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@RestController
@RequestMapping("/article")
//@ComponentScan("com.liang.blog.*")
public class ArticleController {

    @Resource
    ArticleService articleService;

    @GetMapping("/getArticleById")
    public Object getArticleById() {

        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        queryWrapper.ne("id", 0);

        return articleService.list(queryWrapper);
    }
}

