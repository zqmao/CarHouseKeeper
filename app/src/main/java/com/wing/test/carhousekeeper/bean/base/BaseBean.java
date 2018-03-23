package com.wing.test.carhousekeeper.bean.base;

import java.io.Serializable;

/**
 * Created by Wing on 2017/5/10.
 * bean father
 */

public class BaseBean<T> implements Serializable {

    private T data;
    private Integer code;
    private String msg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
