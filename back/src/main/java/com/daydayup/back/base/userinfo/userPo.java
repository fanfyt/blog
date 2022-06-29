package com.daydayup.back.base.userinfo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户基本类
 * @author zhouxm
 */
@Data
@TableName("user")
public class userPo implements Serializable {

    /**
     * 主键ID
     * */
    private Long id;

    /**
     * 登录名称
     * */
    private String name;

    /**
     * 登录密码
     * */
    private String passWord;

    /**
     * 中文名称
     * */
    private String nameEn;

    /**
     * 英文名称
     * */
    private String nameCn;

    /**
     * 别名
     * */
    private String aliName;

    /**
     * 博客id集合
     * */
    private List<Long> BlogId;

    /**
     * 创建时间
     * */
    private Date creatDate;

    /**
     * 修改时间
     * */
    private Date modDate;

    /**
     * 修改人ID
     * */
    private Long modPen;



}
