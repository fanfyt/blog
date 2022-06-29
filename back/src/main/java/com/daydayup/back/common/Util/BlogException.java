package com.daydayup.back.common.Util;

/**
 * @author zhouxm
 *
 */
public class BlogException extends Exception {
    /**
     * 异常状态码
     */
    private String code;
    /**
     * 异常秒杀信息
     */
    private String message;

    public BlogException() {
        super();
    }

    public BlogException(String message) {
        super(message);
        this.message = message;
    }

    public BlogException(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }
}
