package com.itheima.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        //李工
        int rs = sum(10,20);
        System.out.println("李工："+rs);

        //张工
        int rs2 = sum(30,20);
        System.out.println("张工："+rs2);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
