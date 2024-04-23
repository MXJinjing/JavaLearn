package com.itheima.constructor;

import com.itheima.constructor.Student;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("播仔",99);

        Student s1 = new Student();
        Student s2 = new Student("小黑",59);

        System.out.println(s2.name);
        System.out.println(s2.score);
    }
}
