package com.example.usersystem.service;

import com.example.usersystem.model.User;

import java.util.List;

public interface IUserService {

    // 获取单条信息
    public User getOne(int id);

    // 查询
    public List<User> selectAll();

    public int insertUser(User user);

    public int delUser(int id);

    /**
     * 查询用户名和手机号
     * @param user 用户
     * @return List
     */
    public List<User> selectWhere(User user);

}
