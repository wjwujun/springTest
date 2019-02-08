package com.hello.sping;

public class User {
    private  String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(this.name);
    }



    public void add(){
        System.out.println("i am test");
    }





}
