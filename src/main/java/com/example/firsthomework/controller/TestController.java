package com.example.firsthomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/ceshi")
    public String test(){
        return "22软工1班张济鹏22434010110";
    }
}
