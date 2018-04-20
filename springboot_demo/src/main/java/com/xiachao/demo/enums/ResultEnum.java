package com.xiachao.demo.enums;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by XiaChao on 2018-04-19  下午 4:53 .
 */
public enum ResultEnum {
    UNKNOW_ERROR(-1,"未知错误"),
    SUCCESS(1,"OK"),
    PRIMARY_SCHOOL(100,"小学"),
    MIDDLE_SCHOOL(101,"中学")
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
