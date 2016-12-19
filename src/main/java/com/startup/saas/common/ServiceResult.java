package com.startup.saas.common;

/**
 * Created by Administrator on 2016/12/14.
 */
public class ServiceResult<T> {

    private int code;
    private String msg;
    private T t;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public ServiceResult(int code,String msg,T t){
        this.code = code;
        this.msg = msg;
        this.t = t;
    }

    public static <T> ServiceResult withSuccess(String msg,T t){
        return new ServiceResult(200,msg,t);
    }

    public static ServiceResult withSuccess(){
        return withSuccess("操作成功",null);
    }

    public static ServiceResult withSuccess(String msg){
        return withSuccess(msg,null);
    }

    public static <T> ServiceResult withFailed(String msg ,T t){
        return new ServiceResult(400,msg,t);
    }

    public static ServiceResult withFailed(String msg){
        return withFailed(msg,null);
    }

    public static <T> ServiceResult withFailed(T t){
        return withFailed("操作失败",null);
    }
}
