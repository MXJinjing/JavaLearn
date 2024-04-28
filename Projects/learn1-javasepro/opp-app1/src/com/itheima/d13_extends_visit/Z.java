package com.itheima.d13_extends_visit;

public class Z extends F {
    String name = "子类名称";

    public void showName(){
        String name = "局部名称";
        System.out.println(name);
        System.out.println(this.name);  //子类成员
        System.out.println(super.name); //父类成员
    }

    @Override
    public void print1(){
        System.out.println("===子类执行的print1方法===");
    }

    public void showMethod(){
        print1();   //子类的方法
        super.print1();//父类的方法
    }
}
