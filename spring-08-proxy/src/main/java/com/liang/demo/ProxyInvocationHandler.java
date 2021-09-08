package com.liang.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//等会我们会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public Object getRent() {
        return target;
    }

    public void setRent(Object rent) {
        this.target = rent;
    }
    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public void logInfo(String msg) {
        System.out.println("执行了"+msg+"方法");
    }
    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logInfo(method.getName());
        //动态代理的本质，就是使用反射机制实现
        Object result = method.invoke(target, args);
        return result;
    }
}
