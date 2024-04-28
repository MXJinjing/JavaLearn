package com.itheima.d9_modifier;

public class Demo {
    public static void main(String[] args) {
        Fu  f = new Fu();
        // f.privateMethod();    不能访问
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
