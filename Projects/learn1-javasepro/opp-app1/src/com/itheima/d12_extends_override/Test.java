package com.itheima.d12_extends_override;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.print1();
        b.print2(2,3);

        System.out.println("---------------");

        Student s = new Student("播妞",19);
        System.out.println(s.toString());
        System.out.println(s);

    }
}
