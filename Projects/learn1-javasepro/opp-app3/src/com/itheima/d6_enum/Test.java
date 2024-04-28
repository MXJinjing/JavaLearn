package com.itheima.d6_enum;

public class Test {
    public static void main(String[] args) {
        A a1 = A.X;
        A a2 = A.Y;
        A a3 = A.Z;

        System.out.println(a2.ordinal());
        System.out.println(a3.ordinal());
    }
}
