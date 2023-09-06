package com.liang.blog.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

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
@TableName("article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 作者
     */
    private Long blogUserId;

    /**
     * 标题
     */
    private String title;

    /**
     * 创作时间
     */
    private LocalDate createTime;

    /**
     * 最近更新时间
     */
    private LocalDate updateTime;

    /**
     * 发布时间
     */
    private LocalDate publishTime;

    /**
     * 文章状态
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDate getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDate publishTime) {
        this.publishTime = publishTime;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id = " + id +
                ", blogUserId = " + blogUserId +
                ", title = " + title +
                ", createTime = " + createTime +
                ", updateTime = " + updateTime +
                ", publishTime = " + publishTime +
                ", state = " + state +
                "}";
    }
}
