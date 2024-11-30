package com.example.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController { 

    @RequestMapping("/getstr")
    public String getStr(){
        return "当前生效的配置文件是  test";
    }

}
