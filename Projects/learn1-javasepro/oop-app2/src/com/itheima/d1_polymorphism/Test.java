package com.itheima.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        People p1 = new Teacher();
        p1.run();

        People p2 = new Student();
        p2.run();
    }
}
