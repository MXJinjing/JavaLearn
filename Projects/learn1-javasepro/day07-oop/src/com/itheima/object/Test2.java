package com.itheima.object;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";

        Student s2 = s1;
        s2.name = "李四";

        System.out.println(s1.name);

        s1 = null;
        s2 = null;
//        System.out.println(s1.name);
    }
}
