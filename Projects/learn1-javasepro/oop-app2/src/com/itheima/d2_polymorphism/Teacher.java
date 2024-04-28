package com.itheima.d2_polymorphism;

public class Teacher extends People {
    @Override
    public void run() {
        System.out.println("老师跑得慢");
    }

    public void teach() {
        System.out.println("老师教知识");
    }
}
