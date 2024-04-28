package com.itheima.d3_final;

public class Test {
    public static final String SCHOOL_NAME = "黑马";//常量
    public static void main(String[] args) {
        //修饰变量总规则，有且仅能赋值一次
        final int a;
        a = 13;//二次赋值报错
        final double r = 3.14;
        //r = 0.1;//二次赋值报错
    }
}

final class A{}
//class B extends  A{}  //不能继承

class C{
    public final void test(){
    }
}

class D extends C{
    //不能重写
    //@override
    //public void test(){
    //}
}


