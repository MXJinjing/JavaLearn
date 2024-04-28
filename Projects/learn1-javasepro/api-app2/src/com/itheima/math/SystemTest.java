package com.itheima.math;

import javax.sound.midi.Soundbank;

public class SystemTest {
    public static void main(String[] args) {
//        System.exit(0); //终止虚拟机
        long time = System.currentTimeMillis();
        System.out.println(time);

        for(int i = 0; i < 1000000; i++){
            System.out.println();
        }

        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time)/1000.0 + "s");
    }
}
