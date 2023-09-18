package com.liang.blog.config.sys;

/**
 * 相应对象定义
 *
 * @author liang
 */
public class Result {

    private String code;

    private String msg;

    private Object data;

    public Result() {
    }

    public Result(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", Data=" + data +
                '}';
    }


    public static Result sucess() {
        return new Result("200", "", "");
    }

    public static Result sucess(String msg) {
        return new Result("200", msg, "");
    }

    public static Result sucess(Object data) {
        return new Result("200", "sucess", data);
    }

    public static Result sucess(String code, String msg) {
        return new Result(code, msg, "");
    }

    public static Result sucess(String code, String msg, Object data) {
        return new Result(code, msg, data);
    }

    public static Result fail() {
        return new Result("200", "", "");
    }

    public static Result fail(String msg) {
        return new Result("200", msg, "");
    }

    public static Result fail(String code, String msg) {
        return new Result(code, msg, "");
    }

    public static Result fail(String msg, Object data) {
        return new Result("200", msg, data);
    }


}
