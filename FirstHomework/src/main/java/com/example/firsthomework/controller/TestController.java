package com.example.firsthomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/ceshi")
    public String demo(){
        return "22软工1班刘奇翰22434010111";
    }
}
