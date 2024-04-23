package com.itheima.define;

public class MethodProblemDemo3 {
    public static void main(String[] args) {
        //常见问题
        printHelloWorld();

        //调用有返回值的方法
        int rs = sum(10,20);
        System.out.println(rs);

        //直接输出调用
        System.out.println(sum(10,20));


        //直接调用
        sum(100,200);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
}
