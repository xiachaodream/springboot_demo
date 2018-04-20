package com.xiachao.demo.service;

import com.xiachao.demo.domain.Boy;
import com.xiachao.demo.enums.ResultEnum;
import com.xiachao.demo.exception.BoyException;
import com.xiachao.demo.repository.BoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by XiaChao on 2018-04-19  下午 3:22 .
 */
@Service
public class BoyService {
    @Autowired
    private BoyRepository boyRepository;
    public void checkAge(Integer id) throws BoyException {
        Boy boy = boyRepository.findById(id).get();
        Integer age = boy.getAge();
        if(age<10){
            throw new BoyException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age>=10&&age<16){
            throw new BoyException(ResultEnum.MIDDLE_SCHOOL);
        }

    }
}
