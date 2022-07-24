package com.ylj.service.impl;

import com.ylj.dao.UserDao;
import com.ylj.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    /*public void setUserDao(UserDao userDao) {
                this.userDao = userDao;
            }*/
    public void save() {
        userDao.save();
    }
}
