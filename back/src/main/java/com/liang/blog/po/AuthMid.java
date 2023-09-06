package com.liang.blog.po;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("auth_mid")
public class AuthMid implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 权限id
     */
    private Integer authId;

    /**
     * 创建时间
     */
    private LocalDate createTime;

    @TableField("`type`")
    private Boolean type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AuthMid{" +
        "id = " + id +
        ", userId = " + userId +
        ", authId = " + authId +
        ", createTime = " + createTime +
        ", type = " + type +
        "}";
    }
}
