package com.hello.sping;

import com.hello.sping.Person;
import com.hello.sping.User;
import com.hello.sping.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        demo6();
    }
    //静态工厂来创建
    private static void demo6() {
        //1.加载spring配置
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        //得到配置文件
        Bean bean = (Bean)context.getBean("bean");
        System.out.println(bean);
        bean.add();
    }

    //复杂数据注入
    private static void demo5() {
        //1.加载spring配置
      ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        //得到配置文件
        Person person = (Person) context.getBean("person");
        person.printName();

    }


    //p空间名称注入
    private static void demo4() {
        //1.加载spring配置
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        //得到配置文件
        User user = (User)context.getBean("user");
        user.printName();
    }

    //对象属性方法注入
    private static void demo3() {
        //1.加载spring配置
       ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        //得到配置文件
        UserService userService = (UserService)context.getBean("userService");
        userService.add();
    }



    //使用有参构造方法
    private static void demo2() {
        //1.加载spring配置
         ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        //得到配置文件
        User user = (User)context.getBean("user");
        System.out.println(user);
        user.printName();
    }



    //ioc 入门
    private static void demo1() {
        //1.加载spring配置
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");

        //得到配置文件
        User user = (User)context.getBean("user");
        System.out.println(user);
        user.add();
    }



}
