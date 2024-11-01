package com.example.demo4.service.Imp;

import com.example.demo4.dao.UserDao;
import com.example.demo4.moudel.User;
import com.example.demo4.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Override
    public boolean add(User user) {
        UserDao userDao = new UserDao();
        userDao.addUser(user);
        return true;
    }

    @Override
    public List<User> SelectUser(User user) {
        UserDao userDao = new UserDao();
        List<User> list = userDao.SelectUser(user);
        return list;
    }
}
