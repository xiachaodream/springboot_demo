package com.xiachao.demo.handle;

import com.xiachao.demo.domain.ResultMsg;
import com.xiachao.demo.exception.BoyException;
import com.xiachao.demo.util.ResultMsgUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by XiaChao on 2018-04-19  下午 3:28 .
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = BoyException.class)
    @ResponseBody
    public ResultMsg handException(BoyException e){
        return ResultMsgUtil.result_error(e.getCode(),e.getMessage());
    }

}
