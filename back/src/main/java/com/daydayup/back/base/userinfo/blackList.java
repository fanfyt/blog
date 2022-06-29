package com.daydayup.back.base.userinfo;

import java.util.Date;
import java.util.List;

/**
 * 黑名单
 *
 * @author zhouxm
 */
public class blackList {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 被拉黑人员ID
     */
    private Long blackID;


    /**
     * 创建时间
     */
    private Date creatDate;

    /**
     * 修改时间
     */
    private Date modDate;

    /**
     * 修改人ID
     */
    private Long modPen;
}
