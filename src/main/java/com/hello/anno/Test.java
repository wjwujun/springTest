package com.hello.anno;

import com.hello.sping.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        demo3();
    }

    //注解和配置混合使用
    private static void demo3() {
        //1.加载spring配置
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context1.xml");
        //得到配置文件
        bookService book = (bookService)context.getBean("bookService");
        book.add();
    }

    //注入属性
    private static void demo2() {
        //1.加载spring配置
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context1.xml");
        //得到配置文件
        UserService userService = (UserService)context.getBean("userService");
        userService.add();
    }

    //注解开发
   private static void demo1() {
       //1.加载spring配置
       ApplicationContext context=new ClassPathXmlApplicationContext("spring-context1.xml");
       //得到配置文件
       //得到配置文件
       User user = (User)context.getBean("user");
       user.add();
    }
}
