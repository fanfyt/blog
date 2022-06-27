package com.daydayup.back.base.bloginfo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author zhouxm
 */

@Data
@TableName("BlogInfo")
public class blogPo implements Serializable {

    /**博客id
     * */
    private Long BlogId;

    /**博客标题
     * */
    private String title;

    /**博客说明
     * */
    private String explain;

    /**博客内容
     * */
    private String BlogInfo;

    /**博客评论ID集合
     * */
    private List<Long> comment;

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

    /**
     * 修改人ID
     * */
    private Long modPen;

}
