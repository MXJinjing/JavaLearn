package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(5 / 2);  //2.5->2
        System.out.println(5. / 2);  //2.5

        int i = 5;
        int j = 2;
        System.out.println(i / j);  //2.5->2
        System.out.println(1.*i / j);  //2.5

        System.out.println(a % b);
        System.out.println(3 % 2);

        System.out.println("--------------------------------------");

        //目标2 使用+作为连接符
        int a2 = 5;
        System.out.println("abc" + a2);
        System.out.println(a2 + 5);
        System.out.println("ithiema" + a2 + 'a');
        System.out.println(a2 + 'a' + "itheima");
    }
}
