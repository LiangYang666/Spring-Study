package com.liang.dao;

public class OracleDaoImpl implements UserDao{
    public OracleDaoImpl() {
        System.out.println("Oracle的无参构造方法");
    }

    @Override
    public void getUser() {
        System.out.println("Oracle获得数据");
    }
}
