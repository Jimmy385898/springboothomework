package com.example.demo4.controller;

import com.example.demo4.moudel.User;
import com.example.demo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/setadd")
    public String add(int id,String username,String pwd,int age){
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPwd(pwd);
        user.setAge(age);
        System.out.println("进入添加方法");
        boolean myAdd = userService.add(user);
        if (myAdd) {
            return "添加成功";
        } else {
            return "添加失败";
        }

    }

    @RequestMapping("/getUser")
    public List<User> SelectUser(String name){
        System.out.println("进入查询方法");
        User user = new User();
        user.setUsername(name);
        List<User> userList = userService.SelectUser(user);
        System.out.println(userList);
        return userList;
    }


    }
