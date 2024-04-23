package com.itheima.random;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            int data = r.nextInt(10);   //0-9
            System.out.println(data);
        }

        System.out.println("--------------------");

        // 3-17之间的随机数
        for (int i = 0; i < 5; i++) {
            int data = r.nextInt(15)+3;   //0-14 +3
            System.out.println(data);
        }

    }
}

