package com.liang.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 博客系统业务用户
 *
 * @author liang
 */
@TableName("blog_user")
public class BlogUserPo {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String password;
    /**
     * 性别：男1 女0 双重性别3  未知4
     */
    private Integer gender;
    private Date birthDay;
    private String email;
    private String phone;
    private Date createTime;
    private String school;
    /**
     * 区域编码（国家、地区）
     */
    private Long areaCode;
    private Long provinceCode;
    /**
     * 活动1 注销0 封禁3
     */
    private Integer state;

    public BlogUserPo() {
    }

    public BlogUserPo(Long id, String name, String password, Integer gender, Date birthDay, String email, String phone, Date createTime, String school, Long areaCode, Long provinceCode, Integer state) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.birthDay = birthDay;
        this.email = email;
        this.phone = phone;
        this.createTime = createTime;
        this.school = school;
        this.areaCode = areaCode;
        this.provinceCode = provinceCode;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
