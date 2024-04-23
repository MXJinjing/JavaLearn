package com.itheima.type;

public class TypeConvensionDemo {
    public static void main(String[] args) {
        byte a = 12;
        int b = a;      //byte -> int
        System.out.println(a);
        System.out.println(b);

        int c = 100;
        double d = c;   //int -> double
        System.out.println(c);

        char ch = 'a';
        int i = ch;     //char -> int
        System.out.println(i);
    }
}
