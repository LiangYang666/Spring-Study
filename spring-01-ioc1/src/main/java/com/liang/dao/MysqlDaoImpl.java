package com.liang.dao;

public class MysqlDaoImpl implements UserDao{
    public MysqlDaoImpl() {
        System.out.println("Mysql的无参构造方法");
    }

    @Override
    public void getUser() {
        System.out.println("Mysql获得数据");
    }
}
