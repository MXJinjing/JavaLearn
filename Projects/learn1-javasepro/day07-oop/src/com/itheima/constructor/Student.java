package com.itheima.constructor;

public class Student {
    String name;
    double score;
    /*构造器*/
    public Student (){
        System.out.println("无参数构造器执行");
    }

    public Student (String name,double score){
        System.out.println("有参数构造器执行");
        this.name = name;
        this.score = score;
    }
}
