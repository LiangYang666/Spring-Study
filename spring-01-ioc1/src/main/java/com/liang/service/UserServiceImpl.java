package com.liang.service;

import com.liang.dao.UserDao;

public class UserServiceImpl implements UserService{
    public UserServiceImpl() {
        System.out.println("UserServiceImpl的无参构造");
    }

    private UserDao userDao;
    @Override
    public void getUser() {
        userDao.getUser();
    }
    public void setDao(UserDao dao){
        userDao = dao;
    }
}
