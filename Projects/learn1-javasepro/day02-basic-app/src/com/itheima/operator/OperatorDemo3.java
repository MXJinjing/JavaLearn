package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
       // 需求:收红包
        double a = 9.5;
        double b = 520;
        a += b; //a = (double)(a+b)
        System.out.println(a);

        //需求：发红包
        double i = 600;
        double j = 520;
        i -= j; // i = (double)i-j
        System.out.println(i);

        int m = 10;
        int n = 5;
        m /= n;
        System.out.println(m);

        m %= n;
        System.out.println(m);

        System.out.println("---------------------------");
        byte x = 10;
        byte y = 30;
        x += y; // == x = (byte)(x+y)
        System.out.println(x);
    }
}
