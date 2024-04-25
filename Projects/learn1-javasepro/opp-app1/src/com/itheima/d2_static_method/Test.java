package com.itheima.d2_static_method;

public class Test {
    public static void main(String[] args) {
        // 1.类方法
        // 类名访问
        Student.printHelloWorld();

        // 对象名访问
        Student s = new Student();
        s .printHelloWorld();

        // 2.对象方法
        s.score = 40;
        s.printPass();
    }
}
