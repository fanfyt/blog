package com.liang.blog.model;

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
    private String content;

    public ArticleModel() {
    }

    public ArticleModel(Article article, String content) {
        this.article = article;
        this.content = content;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "ArticleModel{" +
                "article=" + article +
                ", content='" + content + '\'' +
                '}';
    }
}
