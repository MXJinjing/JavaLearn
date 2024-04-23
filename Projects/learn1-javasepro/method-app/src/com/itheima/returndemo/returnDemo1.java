package com.itheima.returndemo;

public class returnDemo1 {
    public static void main(String[] args) {
        System.out.println("开始");
        chu(10,0);
        System.out.println("结束");
    }

    public static void chu(int a,int b){
        if(b==0){return;}
        int c = a/b;
        System.out.println("除法结果是："+c);
    }
}
