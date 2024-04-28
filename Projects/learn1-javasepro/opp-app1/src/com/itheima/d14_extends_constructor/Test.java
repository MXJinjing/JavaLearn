package com.itheima.d14_extends_constructor;

class F{
    public F(){
        System.out.println("===父类F的无参数构造器执行了===");
    }
}

class Z extends F{
    public Z(){
        System.out.println("===子类Z的无参数构造器执行了===");
    }

    public Z(String name){
        System.out.println("===子类Z的有参数构造器执行了===");
    }
}

public class Test {
    public static void main(String[] args) {
        Z z = new Z();
        Z z2 = new Z("播妞");
    }
}
