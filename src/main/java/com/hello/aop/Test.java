package com.hello.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {

        //1.加载spring配置
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context2.xml");
        Book book = (Book) context.getBean("book");
        book.add();
    }



}
