package com.itheima.d1_staticdemo;

public class Test {
    public static void main(String[] args) {
        // 类变量的用法
        Student.name = "袁华";

        Student s1 = new Student();
        s1.name = "马冬梅";

        Student s2 = new Student();
        s2.name = "秋雅";

        System.out.println(s1.name);
        System.out.println(Student.name);


        // 对象，实例变量
        s1.age = 23;
        s2.age = 18;
        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}
