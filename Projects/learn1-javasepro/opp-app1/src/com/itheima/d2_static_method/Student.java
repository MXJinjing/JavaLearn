package com.itheima.d2_static_method;

public class Student {
    double score;
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public void printPass(){
        System.out.println("成绩"+
                (score >= 60 ? "合格":"不合格"));
    }
}
