package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //三元运算符
        double score = 98.5;
        String rs = score >=60 ? "成绩合格" : "成绩不合格";
        System.out.println(rs);

        //找出最大值并输出
        int a = 99;
        int b = 67;
        int max = a > b ? a : b;
        System.out.println(max);

        //3个整数最大值
        int i = 10;
        int j = 45;
        int k = 34;
        int temp = i > j ?  i:
                     j > k ? j : k;

        System.out.println(temp);

        System.out.println((10>3 || 10>3) && 10<3);
    }
}
