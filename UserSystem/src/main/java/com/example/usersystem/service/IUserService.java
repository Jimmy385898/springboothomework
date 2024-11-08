package com.example.usersystem.service;

import com.example.usersystem.model.User;

import java.util.List;

public interface IUserService {

    // 获取单条信息
    public User getOne(int id);

    // 查询
    public List<User> selectAll();

}
