package com.example.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @RequestMapping("/getstr")
    public String getStr(){
        return "我来了";
    }

}
