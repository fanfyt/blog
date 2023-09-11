package com.liang.blog.model;

import com.liang.blog.mongodb.ArticleData;
import com.liang.blog.po.Article;

/**
 * @author liang
 */
public class ArticleModel {

    /**
     * 文章描述信息
     */
    private Article article;

    /**
     * 文章内容
     */
    private ArticleData content;

    public ArticleModel() {
    }

    public ArticleModel(Article article, ArticleData content) {
        this.article = article;
        this.content = content;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public ArticleData getContent() {
        return content;
    }

    public void setContent(ArticleData content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleModel{" +
                "article=" + article +
                ", content=" + content +
                '}';
    }
}
