package com.hello.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
* 注解
* */
@Aspect
class MyBook1 {

    @Before(value="execution(* com.hello.aop.Book.*(..))")
    public void before1(){
        System.out.println("注解,前置增强..................");
    }

    @After(value="execution(* com.hello.aop.Book.*(..))")
    public void after1(){
        System.out.println("注解,后置增强..................");
    }

    //环绕增强
    @Around(value="execution(* com.hello.aop.Book.*(..))")
    public void around1(ProceedingJoinPoint point) throws Throwable {
        //方法执行前
        System.out.println("注解,环绕执行前****");
        //被执行的增强的方法
        point.proceed();

        //方法执行后
        System.out.println("注解,环绕执行后***");
    }

}
