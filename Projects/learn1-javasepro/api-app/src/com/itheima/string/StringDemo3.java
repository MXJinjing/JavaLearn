package com.itheima.string;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);

        String a1 = new String("abc");
        String a2 = new String("abc");
        System.out.println(a1 == a2);
    }
}
