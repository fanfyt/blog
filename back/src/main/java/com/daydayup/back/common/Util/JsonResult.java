package com.daydayup.back.common.Util;

import lombok.Data;

/**
 * @author zhouxm
 * 返回json
 */
@Data
public class JsonResult {

    /**
     * 返回描述
     * */
    private String message;

    /**
     * 返回状态吗 200成功 -1失败
     * */
    private Integer code;

    /**
     * 返回信息
     * */
    private Object object;


}
