package com.itheima.thisdemo;

import com.itheima.thisdemo.Student;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();

        Student s2 = new Student();
        System.out.println(s2);
        s2.printThis();

        Student s3 = new Student();
        s3.score = 325;
        s3.printPass(300);
    }
}
