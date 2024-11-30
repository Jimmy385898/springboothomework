package com.example.demo4.dao;

import com.example.demo4.moudel.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public boolean addUser(User user){
        boolean myBool = false;
        List<User> userList = new ArrayList<>();
        userList.add(user);
        myBool = true;
        System.out.println(userList);
        return myBool;
    }

    public List<User> SelectUser(User user){
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setId(20);
        user1.setUsername("lwy");
        user1.setPwd("123456");
        user1.setAge(21);
        userList.add(user1);
        userList.add(user);
        return userList;
    }

}
