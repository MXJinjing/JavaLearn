package com.itheima.loop;

public class DoWhileDemo5 {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println("Hello World");
            i ++;
        }while (i < 3);



        // 特点：先执行后判断
        do{
            System.out.println("Hello World");
        }while (false);

        System.out.println("---------------");

        for(int j = 0; j < 3; j++){
            System.out.println("Hello World");
        }

        int m = 0;
        while(m < 3){
            System.out.println("Hello World");
            m++;
        }
        System.out.println(m);
    }
}
