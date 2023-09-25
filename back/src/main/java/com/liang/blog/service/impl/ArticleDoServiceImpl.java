package com.liang.blog.service.impl;

import com.liang.blog.model.ArticleModel;
import com.liang.blog.mongodb.ArticleData;
import com.liang.blog.mongodb.MgArticleService;
import com.liang.blog.po.Article;
import com.liang.blog.service.ArticleDoService;
import com.liang.blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liang
 */
@Service
public class ArticleDoServiceImpl implements ArticleDoService {
    private final MongoTemplate mongoTemplate;
    @Resource
    MgArticleService mgArticleService;

    @Resource
    ArticleService articleService;

    public ArticleDoServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    @Transactional
    public boolean saveArticleModel(ArticleModel articleModel) {

        try {
            // 文章信息保存到 mysql
            Article article = articleModel.getArticle();
            boolean save = articleService.save(article);
            // 文章保存到 mongodb
            ArticleData articleData = mgArticleService.saveArticle(articleModel.getContent());
            return save;
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * 根据文章id获取文章
     *
     * @param id 文章id
     * @return
     */
    @Override
    public ArticleModel getByArticleId(String id) {

        ArticleModel articleModel = new ArticleModel();
        Article article = articleService.getById(id);
        ArticleData articleContent = null;
        if (article != null) {
            articleContent = mgArticleService.findArticleById(id);
        }
        articleModel.setArticle(article);
        articleModel.setContent(articleContent);

        return articleModel;
    }

    @Override
    public List<Object> getArticleContentByAuthorId(Long authorId) {
        return null;
    }

    @Override
    public boolean del(List<String> list) {

        boolean removed = articleService.removeBatchByIds(list);
        if (removed) {
            mgArticleService.delArticles(list);
        }
        return false;
    }


}
