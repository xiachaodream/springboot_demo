package com.xiachao.demo.exception;

import com.xiachao.demo.enums.ResultEnum;

/**
 * Created by XiaChao on 2018-04-19  下午 4:28 .
 */
public class BoyException extends RuntimeException {
    private Integer code;

    public BoyException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
