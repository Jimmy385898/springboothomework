package com.example.usersystem.service.imp;

import com.example.usersystem.dao.IUserDao;
import com.example.usersystem.model.User;
import com.example.usersystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements IUserService {

    // 调用Dao层对应接口
    @Autowired
    private IUserDao userDao;

    // 获取单条数据
    @Override
    public User getOne(int id) {
        return userDao.getOne(id);
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public List<User> selectByUsername(String username) {
        return userDao.selectByUsername(username);
    }

    @Override
    public int insertUser(User user) {
        if (!this.selectByUsername(user.getUsername()).isEmpty()){
            return -1;
        }
        return userDao.insertUser(user);
    }

    /**
     * 删除用户
     * @param id 用户id
     * @return 删除结果
     */
    @Override
    public int delUser(int id) {
        return userDao.delUser(id);
    }
}
