package com.itheima.d6_lambda;

public class LambdaTest1 {
    public static void main(String[] args) {
//        Animal a = new Animal() {
//            @Override
//            public void run() {
//                System.out.println("狗跑的贼快");
//            }
//        };

        // 注意：不能简化全部，只能简化函数式接口
        // 接口、有且仅有一个匿名方法
//        Animal a = ()->{
//            System.out.println("狗跑的贼快");
//        }

//        Swimming s = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("学生快乐的游泳");
//            }
//        };

        Swimming s = ()->{
            System.out.println("学生快乐地游泳");
        };
    }
}

interface Swimming{
    void swim();
}


abstract class Animal{
    public abstract void run();
}