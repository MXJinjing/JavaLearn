package com.itheima.d6_enum;

public enum A {
    //常量，记住枚举类的一个对象
    X,Y,Z;
    A(){

    }

    A(String name){
    }
    private String name;

    public String getName(){
        return name;
    }
}
