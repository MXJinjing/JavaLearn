package com.itheima.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        // 需求1：测量用户体温
        double t = 36.9;
        if (t > 37){
            System.out.println("这个人的温度异常，赶紧把他带走");
        }

        // 需求2：发红包
        double money = 99;
        if(money >= 90){
            System.out.println("发红包成功了~");
        }else{
            System.out.println("余额不足");
        }

        // 需求3:绩效系统
        int score = 78;
        if (score >= 0 && score <= 60){
            System.out.println("您的级别是D");
        } else if (score >= 60 && score < 80){
            System.out.println("您的级别是C");
        } else if (score >= 80 && score < 90){
            System.out.println("您的级别是B");
        } else if (score >= 90 && score < 100){
            System.out.println("您的级别是A");
        }
    }
}
