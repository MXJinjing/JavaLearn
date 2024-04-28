package com.itheima.d8_extends_application;

public class Test {
    // 继承的好处
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("潘仔");
        t.setSkill("java、spring");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        t.printInfo();
    }
}
