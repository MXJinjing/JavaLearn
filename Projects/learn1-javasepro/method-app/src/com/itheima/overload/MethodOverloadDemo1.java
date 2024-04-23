package com.itheima.overload;

public class MethodOverloadDemo1 {
    public static void main(String[] args) {
        test();
        test(1);
    }

    public static void test(){
        System.out.println("test1");
    }

    public static void test(int a){
        System.out.println("test2");
    }

    public static void test(double a){

    }

    public static void test(int a, int b){

    }

    public static void test(int b, double a){

    }
}
