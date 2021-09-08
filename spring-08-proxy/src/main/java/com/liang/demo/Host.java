package com.liang.demo;

public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
    @Override
    public void sale() {
        System.out.println("房东要卖房");
    }
}
