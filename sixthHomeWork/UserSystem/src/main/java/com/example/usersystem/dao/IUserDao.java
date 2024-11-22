package com.example.usersystem.dao;

import com.example.usersystem.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao {

    // 添加用户
    public int insertUser(User user);

    // 修改用户
    public int updateUser(User user);

    // 删除用户
    public int delUser(int id);

    // 查询
    public List<User> selectAll();

    // 根据id查询
    public User getOne(int id);

    public List<User> selectWhere(User user);

}
