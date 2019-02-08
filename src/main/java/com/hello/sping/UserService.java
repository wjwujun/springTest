package com.hello.sping;

public class UserService {

    /*定义类型*/
    private  UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){

        System.out.println("form service");
        userDao.add();
    }





}
