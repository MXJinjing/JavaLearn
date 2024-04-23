package com.itheima.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        //目标：评委打分案例
        double[] scores = new double[6];

        Scanner sc = new Scanner(System.in);

        //录入
        for (int i = 0; i < scores.length; i++) {
            // i = 0-5
            System.out.println("请输入当前第"+ (i+1) +"个评委的分数：");
            double score =  sc.nextDouble();
            scores[i] = score;
        }

        double sum = 0;

        //求和
        for (int i = 0; i < scores.length; i++) {
            sum  += scores[i];
        }

        System.out.println("选手最终得分是" + sum / scores.length);
    }
}
