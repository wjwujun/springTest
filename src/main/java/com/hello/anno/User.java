package com.hello.anno;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "user")
@Scope(value = "prototype")
public class User {
    /*
     * 4个注解，同样的功能，都是创建对象
     *      @Component
     *      @Service
     *      @Repository
     *      @Controller
     * @Scope(value = "prototype") //创建单实例还是多实例
     *
     *
    * */
    public  void add(){
        System.out.println("第一个注解开发");
    }
}
