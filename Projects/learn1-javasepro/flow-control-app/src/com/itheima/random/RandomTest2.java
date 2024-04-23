package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        //随机生产1-100的中将号码
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        while(true){
            //提示用户信息
            System.out.println("请输入您猜测的数字：");
            int guessNumber = sc.nextInt();

            //判断用户猜的数字大小
            if(guessNumber > luckNumber){
                System.out.println("您猜的数字太大");
            }else if(guessNumber < luckNumber){
                System.out.println("您猜的数字太小");
            }else{
                System.out.println("恭喜你猜对了");
                break;  //结束死循环
            }
        }
    }
}
