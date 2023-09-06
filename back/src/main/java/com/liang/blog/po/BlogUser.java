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
@TableName("blog_user")
public class BlogUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @TableField("`name`")
    private String name;

    @TableField("`password`")
    private String password;

    private String gender;

    private LocalDate birthday;

    private String email;

    private String phone;

    private LocalDate createTime;

    private String school;

    /**
     * 区域编码（国家、地区）
     */
    private String areaCode;

    private String grade;

    private String provinceCode;

    /**
     * 活动1 注销0 封禁3
     */
    private Integer state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BlogUser{" +
        "id = " + id +
        ", name = " + name +
        ", password = " + password +
        ", gender = " + gender +
        ", birthday = " + birthday +
        ", email = " + email +
        ", phone = " + phone +
        ", createTime = " + createTime +
        ", school = " + school +
        ", areaCode = " + areaCode +
        ", grade = " + grade +
        ", provinceCode = " + provinceCode +
        ", state = " + state +
        "}";
    }
}
