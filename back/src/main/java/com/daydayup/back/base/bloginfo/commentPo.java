package com.daydayup.back.base.bloginfo;

import java.util.Date;
import java.util.List;

/**
 * @author zhouxm
 */
public class commentPo {

    /**
     * 论坛ID
     * */
    private Long commentId;

    /**
     * 评论信息
     * */
    private String commentInfo;

    /**
     * 子评论ID
     * */
    private Long fatherCommentId;


    private List<Long> childCommentId;

    /**
     * 创建时间
     * */
    private Date creatDate;

    /**
     * 修改时间
     * */
    private Date modDate;

    /**
     * 创建人ID
     * */
    private Long creatPen;
}
