package com.xiachao.demo.util;

import com.xiachao.demo.domain.ResultMsg;

/**
 * Created by XiaChao on 2018-04-19  下午 2:41 .
 */
public class ResultMsgUtil {

    public static ResultMsg result_success(Object data){
        ResultMsg msg = new ResultMsg();
        msg.setCode(1);
        msg.setMsg("ok");
        msg.setData(data);
        return  msg;
    }

    public static ResultMsg result_error(Integer code,String msg){
        ResultMsg resultMsg=new ResultMsg();
        resultMsg.setCode(code);
        resultMsg.setMsg(msg);
        resultMsg.setData(null);
        return resultMsg;
    }
}
