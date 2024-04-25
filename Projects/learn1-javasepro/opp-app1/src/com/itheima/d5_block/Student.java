package com.itheima.d5_block;

public class Student {
    static int number = 80;
    static String schoolName;
    static {
        System.out.println("静态代码块执行了");
        schoolName = "黑马";
    }

    {
        System.out.println("实例代码块执行了");
    }

    public Student(){
        System.out.println("无参数构造器执行了");
    }

    public Student(String name){
        System.out.println("有参数构造器执行了");

    }
}
