package com.liang.blog.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 *
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@TableName("comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 评论人id
     */
    private Long blogUserId;

    /**
     * 被评论文章id
     */
    private Long articleId;

    /**
     * 评论时间
     */
    private LocalDate createTime;

    /**
     * 状态
     */
    private Byte state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBlogUserId() {
        return blogUserId;
    }

    public void setBlogUserId(Long blogUserId) {
        this.blogUserId = blogUserId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id = " + id +
                ", blogUserId = " + blogUserId +
                ", articleId = " + articleId +
                ", createTime = " + createTime +
                ", state = " + state +
                "}";
    }
}
