package com.itheima.d4_static_attention;

public class Student {
    static String schoolName;   //类变量
    double score;
    //
    public static void printHelloWorld(){
        //Student.schoolName = "黑马";
        //可以省略类名
        schoolName = "黑马";
        Student.printHelloWorld2();

        //System.out.println(score);
        //printPass();
    }

    public static void printHelloWorld2(){}

    public void printPass(){
        schoolName = "黑马2";
        printHelloWorld();

        System.out.println(score);
        this.printPass2();
    }

    public void printPass2(){   }
}

