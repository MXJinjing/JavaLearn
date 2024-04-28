package com.itheima.d8_interface2;

public class Test {
    public static void main(String[] args) {
        Driver s = new A();
        s.drive();

        Driver d = new B();
        d.drive();
    }
}

class A extends Student implements Driver,Singer{

    @Override
    public void drive() {

    }

    @Override
    public void sing() {

    }
}

class B extends Student implements Driver{

    @Override
    public void drive() {

    }
}

class Student{

}

interface Driver{
    void drive();
}

interface Singer{
    void sing();
}