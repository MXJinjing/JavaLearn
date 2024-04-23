package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int a = 10;
        a++;    // a = a+1
        ++a;
        System.out.println(a);

        a--;    // a = a-1
        --a;
        System.out.println(a);
        System.out.println("-------------------------------------");
        int i = 10;
        int rs = ++i;
        System.out.println(rs);
        System.out.println(i);

        int j = 10;
        int rs2 = j++;
        System.out.println(rs2);
        System.out.println(j);
    }
}
