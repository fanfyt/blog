package com.liang.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 文章实体类
 *
 * @author liang
 */

@TableName("article")
public class ArticlePo {

    @TableId(type = IdType.AUTO)
    private Long id;
    private Long blogUserId;
    private String title;
    private Date createTime;
    private Date updateTime;
    /**
     * 浏览次数
     */
    private Long viewsCount;
    /**
     * 文章状态 0公开 1私有 2好友可见 3禁止
     */
    private Integer state;

    public ArticlePo() {
    }

    public ArticlePo(Long id, Long blogUserId, String title, Date createTime, Date updateTime, Long viewsCount, Integer state) {
        this.id = id;
        this.blogUserId = blogUserId;
        this.title = title;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.viewsCount = viewsCount;
        this.state = state;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(Long viewsCount) {
        this.viewsCount = viewsCount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
