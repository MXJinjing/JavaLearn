package com.itheima.loop;

public class LoopNestedDemo7 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            // i = 1,2,3
            for(int j = 0; j < 5; j++){
                System.out.println("我爱你" + i);
            }
            System.out.println("----------------------------");
        }
        for(int i = 1; i <= 3 ; i++){
            for(int j = 1; j <= 4; j++){
                System.out.print("*");//不换行
            }
            System.out.println();//换行
        }
    }
}
