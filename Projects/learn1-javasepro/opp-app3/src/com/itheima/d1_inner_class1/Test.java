package com.itheima.d1_inner_class1;

public class Test {
    public static void main(String[] args) {
        // 创建内部类
        Outer.Inner in = new Outer().new Inner();
        in.test();
    }
}
