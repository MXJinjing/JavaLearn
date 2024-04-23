package com.itheima.demo;

public class Test1 {
    public static void main(String[] args) {
        int[] faceScores = {15,9000,1000,0,20000,9500,-5};

        //求最大值
        int max = faceScores[0];

        for (int i =0 ; i < faceScores.length ; i++){
            if (faceScores[i] > max){
                max = faceScores[i];
            }
        }
        System.out.println("最高颜值是："+max);

    }
}
