package com.liang.blog.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

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
public class Liking implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 评论人id
     */
    private Long blogUserId;

    /**
     * 文章/评论 id
     */
    private Long articleOrCommentId;

    /**
     * 赞/踩
     */
    private Byte isLike;

    /**
     * 时间
     */
    @TableField("`time`")
    private LocalDate time;

    /**
     * 0文章动态评论  1评论评论
     */
    @TableField("`type`")
    private Byte type;

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

    public Long getArticleOrCommentId() {
        return articleOrCommentId;
    }

    public void setArticleOrCommentId(Long articleOrCommentId) {
        this.articleOrCommentId = articleOrCommentId;
    }

    public Byte getIsLike() {
        return isLike;
    }

    public void setIsLike(Byte isLike) {
        this.isLike = isLike;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Liking{" +
                "id = " + id +
                ", blogUserId = " + blogUserId +
                ", articleOrCommentId = " + articleOrCommentId +
                ", isLike = " + isLike +
                ", time = " + time +
                ", type = " + type +
                "}";
    }
}
