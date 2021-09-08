package com.liang.pojo;

public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void shout(){
        System.out.println(name+"旺旺~");
    }
}
