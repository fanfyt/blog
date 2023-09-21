package com.liang.blog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liang.blog.model.ArticleModel;
import com.liang.blog.model.Result;
import com.liang.blog.po.Article;
import com.liang.blog.service.ArticleDoService;
import com.liang.blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
public class ArticleController {

    @Resource
    ArticleDoService articleDoService;
    @Resource
    ArticleService articleService;

    /**
     * 根据id查询文章
     *
     * @param id 文章id
     * @return Object
     */
    @GetMapping("/getArticleById/{id}")
    public Object getArticleById(@PathVariable Long id) {

        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);

        return articleService.list(queryWrapper);
    }


    /**
     * 新增文章
     *
     * @param article 文章
     * @return Object
     */
    @PostMapping("add")
    public Result add(@RequestBody ArticleModel article) {

        return Result.sucess(articleDoService.saveArticleModel(article));
    }


    /**
     * 根据文章id批量删除文章
     *
     * @param list 待删除文章id列表
     * @return Result
     */
    @DeleteMapping("del")
    public Result del(@RequestBody List<String> list) {

        return Result.sucess(articleDoService.del(list));
    }


}

