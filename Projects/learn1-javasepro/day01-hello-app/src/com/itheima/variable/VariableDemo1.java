package com.itheima.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        // 1. 定义整数变量
        int age = 23;
        System.out.println(age);

        // 2. 定义双精度浮点
        double score = 99.5;
        System.out.println(score);

        System.out.println("------------------------------");

        // 3. 使用变量的好处，便于拓展和维护
        int number = 666;
//        System.out.println(666);
//        System.out.println(666);
//        System.out.println(666);
//        System.out.println(666);
//        System.out.println(666);
//        System.out.println(666);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        //4. 变量的数据可以替换
        int age2 = 18;
        System.out.println(age2);
        age2 = 19;  //赋值语句
        System.out.println(age2);
        age2 = age2 + 1;    //+1
        System.out.println(age2);

        //5. 需求模拟
        double money = 9.5;
        System.out.println(money);

        //收红包10元
        money = money + 10;
        System.out.println(money);

        //发红包5元
        money = money - 5;
        System.out.println(money);
    }
}
