package com.liang.blog.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@TableName("user_category")
public class UserCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 目录id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 目录名称
     */
    private String categoryName;

    /**
     * 上级目录id
     */
    private Long upperCategoryId;

    /**
     * 1一级目录 2二级目录 3三级目录
     */
    private Integer grade;

    /**
     * 0文章目录 1图片目录 2文件目录
     */
    @TableField("`type`")
    private Byte type;

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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getUpperCategoryId() {
        return upperCategoryId;
    }

    public void setUpperCategoryId(Long upperCategoryId) {
        this.upperCategoryId = upperCategoryId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserCategory{" +
        "id = " + id +
        ", userId = " + userId +
        ", categoryName = " + categoryName +
        ", upperCategoryId = " + upperCategoryId +
        ", grade = " + grade +
        ", type = " + type +
        "}";
    }
}
