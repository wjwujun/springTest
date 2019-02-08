package com.hello.aop;


import org.aspectj.lang.ProceedingJoinPoint;

/*
* 配置文件
* */
public class MyBook {
    public void before1(){
        System.out.println("前置增强..................");
    }

    public void after1(){
        System.out.println("后置增强..................");
    }

    //环绕增强
    public void around1(ProceedingJoinPoint point) throws Throwable {

        //方法执行前
        System.out.println("环绕执行前");
        //被执行的增强的方法
        point.proceed();

        //方法执行后
        System.out.println("环绕执行后");
    }

}
