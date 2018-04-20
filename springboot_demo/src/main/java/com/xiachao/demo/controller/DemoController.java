package com.xiachao.demo.controller;

import com.xiachao.demo.domain.Gril;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    @Autowired
    private Gril girl;
    @GetMapping(value = "/hello")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") int id){
                return "id:"+id;
    }
}
