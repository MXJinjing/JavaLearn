package com.itheima.d5_abstract2;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("叮当猫");
        a.cry();    //更好支持多态
    }
}
