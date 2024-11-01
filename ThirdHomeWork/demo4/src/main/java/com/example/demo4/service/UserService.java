package com.example.demo4.service;

import com.example.demo4.moudel.User;

import java.util.List;


public interface UserService {

    public boolean add(User user);

    public List<User> SelectUser(User user);

}
