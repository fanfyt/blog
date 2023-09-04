package com.liang.blog.controller;

import com.liang.blog.entity.ArticlePo;
import com.liang.blog.format.Resp;
import com.liang.blog.service.article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liang
 */
@RestController
@RequestMapping("/article")
public class ArticleController {


    final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/{id}")
    public  Resp article(@PathVariable("id") Long id) {
        ArticlePo articlePo = new ArticlePo();
        articlePo.setId(1L);
        articlePo.setTitle("test");
        Resp resp = new Resp(articlePo, HttpStatus.OK);
        return resp;
    }
}
