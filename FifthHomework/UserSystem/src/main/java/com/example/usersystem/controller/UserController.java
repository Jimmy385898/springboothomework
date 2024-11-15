package com.example.usersystem.controller;

import com.example.usersystem.model.User;
import com.example.usersystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    // 调用service层对应接口
    @Autowired
    private IUserService userService;

    @GetMapping("/getstr")
    public String getStr() {
        return "我发布的OpenAPI";
    }

    @GetMapping("/getuser")
    public User getUserOne(int id){
        System.out.println("进入获取单条数据的方法");
        System.out.println("id:"+id);
        User user = userService.getOne(id);
        return user;
    }

    @RequestMapping("/getall")
    public List<User> getAll(){
        System.out.println("进入获取所有数据的方法");
        List<User> userlist = userService.selectAll();
        return userlist;
    }

    @GetMapping("/adduser")
    public String InsertUser(User user){
        System.out.println("进入插入数据的方法");
        int myValue = userService.insertUser(user);
        System.out.println("添加后返回值为："+ myValue);
        return "插入数据成功";
    }

}
