package com.itheima.d11_interface_attention;

public class Test {
    public static void main(String[] args) {

    }
}

interface A {
    void test1();
}
interface B {
    void test2();
}
interface C {
    void test3();
}

interface D extends A, B, C {}

class E implements D {
    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }

    @Override
    public void test3() {

    }
}
