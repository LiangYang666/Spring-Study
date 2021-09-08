package com.liang.service;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("加一个");
    }

    @Override
    public void delete() {
        System.out.println("删除一个");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void select() {
        System.out.println("查询");
    }
}
