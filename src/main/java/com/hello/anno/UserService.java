package com.hello.anno;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")
public class UserService {
    /*
     *在dao属性上面使用注解，完成对象注入,不需要set
     *2中注入方式
     *  @Autowired
     *
     *  @Resource(name = "userDao")
     *      -  name指要注入对象的value值
     */
    /*@Autowired
    private UserDao userDao;*/

    @Resource(name = "userDao")
    private UserDao userDao;


    public void add(){
        System.out.println("service***********");
        userDao.add();
    }

}
