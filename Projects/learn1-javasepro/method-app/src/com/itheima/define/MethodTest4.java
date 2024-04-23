package com.itheima.define;

public class MethodTest4 {
    public static void main(String[] args) {
//        int rs = add(5);
//        System.out.println(rs);
//
//        int rs2 = add(100);
//        System.out.println(rs2);
        System.out.println("----------------------");

        judge(10);
    }

    public static int add(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void judge(int number){
        if(number % 2 == 0 ){
            System.out.println("偶数");
        } else{
            System.out.println("奇数");
        }
    }
}
