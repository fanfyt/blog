package com.liang.blog.service.impl;

import com.liang.blog.model.ArticleModel;
import com.liang.blog.mongodb.ArticleData;
import com.liang.blog.mongodb.MgArticleService;
import com.liang.blog.po.Article;
import com.liang.blog.service.ArticleDoService;
import com.liang.blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author liang
 */
@Service
public class ArticleDoServiceImpl implements ArticleDoService {

    @Resource
    MgArticleService mgArticleService;

    @Resource
    ArticleService articleService;

    @Override
    public boolean saveArticleModel(ArticleModel articleModel) {

        // 文章保存到mongodb
        ArticleData articleData = mgArticleService.saveArticle(articleModel.getContent());
        System.out.println(articleData);
        // 文章信息保存到mysql
        Article article = articleModel.getArticle();

        return articleService.save(article);
    }
}
