package com.liang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect  //标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.liang.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("======方法执行前=======");
    }
    @After("execution(* com.liang.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("======方法执行后=======");
    }
    @Around("execution(* com.liang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Signature signature = jp.getSignature();
        System.out.println("signature:"+signature);
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}
