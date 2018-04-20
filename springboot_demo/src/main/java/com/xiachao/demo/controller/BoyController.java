package com.xiachao.demo.controller;

import com.xiachao.demo.domain.Boy;
import com.xiachao.demo.domain.ResultMsg;
import com.xiachao.demo.enums.ResultEnum;
import com.xiachao.demo.repository.BoyRepository;
import com.xiachao.demo.service.BoyService;
import com.xiachao.demo.util.ResultMsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/boy")
public class BoyController {
    @Autowired
    private BoyRepository boyRepository;
    @Autowired
    private BoyService boyService;
    @GetMapping(value = "/save")
    public ResultMsg<Boy> save(@Valid Boy boy, BindingResult bindingResult){
        ResultMsg<Boy> msg = new ResultMsg<Boy>();
        if(bindingResult.hasErrors()){
            return  ResultMsgUtil.result_error(0,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultMsgUtil.result_success(boyRepository.save(boy));
    }
    @PostMapping(value = "/update/{id}")
    public Boy update(@PathVariable(value = "id") Integer id,@RequestParam(value = "name",required = true) String name,@RequestParam(value = "age",required = true,defaultValue = "0") Integer age){
        Boy boy = boyRepository.getOne(id);
        boy.setName(name);
        boy.setAge(age);
        return boyRepository.save(boy);
    }
    @PostMapping(value = "/findAll")
    public List<Boy> findAll(){
        List<Boy> all = boyRepository.findAll();
        return all;
    }
    @PostMapping(value = "/findOne/{id}")
    public Boy findOne(@PathVariable(value = "id") Integer id){
        System.out.println(id+"------------");
        return boyRepository.findById(id).get();
    }
    @PostMapping(value = "/findByName")
    public List<Boy> findByName(@RequestParam(value = "name",required = true) String name){
        System.out.println(name);
        return boyRepository.findByName(name);
    }
    @GetMapping(value = "/checkAge/{id}")
    public void checkAge(@PathVariable(value = "id") Integer id) throws Exception {
        boyService.checkAge(id);
    }
}
