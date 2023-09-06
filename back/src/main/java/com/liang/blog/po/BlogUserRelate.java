package com.liang.blog.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 关注用户关联表
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@TableName("blog_user_relate")
public class BlogUserRelate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 发起关注者
     */
    private Long followerUserId;

    /**
     * 被关注者id
     */
    private Long beFollowedUserId;

    /**
     * 发起关注时间
     */
    private LocalDate followTime;

    /**
     * 取消关注时间
     */
    private LocalDate disfollowTime;

    /**
     * 是否正在关注(1是  0否）
     */
    private Byte state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFollowerUserId() {
        return followerUserId;
    }

    public void setFollowerUserId(Long followerUserId) {
        this.followerUserId = followerUserId;
    }

    public Long getBeFollowedUserId() {
        return beFollowedUserId;
    }

    public void setBeFollowedUserId(Long beFollowedUserId) {
        this.beFollowedUserId = beFollowedUserId;
    }

    public LocalDate getFollowTime() {
        return followTime;
    }

    public void setFollowTime(LocalDate followTime) {
        this.followTime = followTime;
    }

    public LocalDate getDisfollowTime() {
        return disfollowTime;
    }

    public void setDisfollowTime(LocalDate disfollowTime) {
        this.disfollowTime = disfollowTime;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BlogUserRelate{" +
                "id = " + id +
                ", followerUserId = " + followerUserId +
                ", beFollowedUserId = " + beFollowedUserId +
                ", followTime = " + followTime +
                ", disfollowTime = " + disfollowTime +
                ", state = " + state +
                "}";
    }
}
