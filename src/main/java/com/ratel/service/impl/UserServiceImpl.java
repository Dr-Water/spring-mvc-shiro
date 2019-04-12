package com.ratel.service.impl;

import com.ratel.dao.UserDao;
import com.ratel.model.User;
import com.ratel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sunpeng
 * Date: 2017/9/3
 * Time: 19:18
 * Describe:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserInfo(String userName) {
        return userDao.getUserInfo(userName);
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
