package com.itheima.d3_inner_class3;

public class Test {
    public static void main(String[] args) {
        //1. 把这个匿名内部类编译成子类，创建子类对象
        Animal a = new Animal(){
            @Override
            public void cry(){
                System.out.println("猫喵喵喵的叫~");
            }
        };
        a.cry();
    }
}


abstract class Animal{
    public abstract void cry();
}