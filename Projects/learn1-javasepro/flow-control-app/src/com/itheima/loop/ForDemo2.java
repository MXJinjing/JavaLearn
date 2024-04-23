package com.itheima.loop;

public class ForDemo2 {
    // 批量产生数据
    public static void main(String[] args) {

        int sum = 0;

        // 定义一个循环，产生1-100，求和
        for(int i = 1; i <= 100; i +=2){
            sum = sum + i;
        }
        System.out.println("1-100 sum = "+ sum);

        int sum1 = 0;

        // 定义一个循环，产生1-100，求和
        for(int i = 1; i <= 100; i ++){
            if(i % 2 == 1){
                sum1 += i;
            }
        }
        System.out.println("1-100 sum = "+ sum1);
    }
}
