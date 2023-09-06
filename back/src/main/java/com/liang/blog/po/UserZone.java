package com.liang.blog.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户空间
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@TableName("user_zone")
public class UserZone implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户头像id
     */
    private Long userIconId;

    /**
     * 用户背景图片
     */
    private Long userBgPicId;

    /**
     * 主题id
     */
    private Integer themeId;

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

    public Long getUserIconId() {
        return userIconId;
    }

    public void setUserIconId(Long userIconId) {
        this.userIconId = userIconId;
    }

    public Long getUserBgPicId() {
        return userBgPicId;
    }

    public void setUserBgPicId(Long userBgPicId) {
        this.userBgPicId = userBgPicId;
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    @Override
    public String toString() {
        return "UserZone{" +
        "id = " + id +
        ", userId = " + userId +
        ", userIconId = " + userIconId +
        ", userBgPicId = " + userBgPicId +
        ", themeId = " + themeId +
        "}";
    }
}
