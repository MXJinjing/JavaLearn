package com.itheima.d11_interface_attention;

public class Test2 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.run();

        N n = new N();
        n.test();
    }
}

interface I{
    void test1();
}

interface J{
    String test1();
}

// 一个类继承多个接口，不能有方法起签名冲突
//interface K extends I,J{
//}

// 一个接口继承多个接口，不能有方法起签名冲突
//class E implements I,J{
//}


// 一个类继承了父类，又实现了接口，父类中和接口中有同名默认方法，优先用父类的
class Fu{
    public void run(){
        System.out.println("===父类run===");
    }
}

interface IT1{
    default void run(){
        System.out.println("===接口IT中的run===");
    }
}

class Zi extends Fu implements IT1{

}

// 一个类实现了多个接口，存在同名默认，可以不冲突，这个类要重写
interface It1{
    default void test(){
        System.out.println("IT1");
    }
}

interface IT2{
    default void test(){
        System.out.println("IT2");
    }
}

class N implements It1,IT2{

    @Override
    public void test() {
        System.out.println("自己的test方法");
    }
}