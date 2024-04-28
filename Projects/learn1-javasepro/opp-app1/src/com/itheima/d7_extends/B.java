package com.itheima.d7_extends;

public class B extends A {
    public void print3(){
        System.out.println(i);
        print1();

        // 父类私有的不能继承
        //System.out.println(j);
        //print2();
    }
}
