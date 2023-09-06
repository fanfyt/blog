package com.liang.blog.po;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 收藏文章关联关系表
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@TableName("article_collect_relation")
public class ArticleCollectRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 被收藏文章id
     */
    private Long articleId;

    /**
     * 文章所属收藏目录ID
     */
    private Long categoryId;

    /**
     * 收藏时间
     */
    private LocalDate collectTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDate getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(LocalDate collectTime) {
        this.collectTime = collectTime;
    }

    @Override
    public String toString() {
        return "ArticleCollectRelation{" +
                "id = " + id +
                ", userId = " + userId +
                ", articleId = " + articleId +
                ", categoryId = " + categoryId +
                ", collectTime = " + collectTime +
                "}";
    }
}
