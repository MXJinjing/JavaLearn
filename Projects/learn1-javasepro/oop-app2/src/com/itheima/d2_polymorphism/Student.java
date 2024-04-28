package com.itheima.d2_polymorphism;

public class Student extends People {
    @Override
    public void run() {
        System.out.println("学生跑得快");
    }

    public void test() {
        System.out.println("考试");
    }
}
