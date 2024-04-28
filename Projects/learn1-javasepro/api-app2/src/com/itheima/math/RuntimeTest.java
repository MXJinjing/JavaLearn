package com.itheima.math;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();   //获取运行时对象

//        r.exit(0);//终止虚拟机

        System.out.println(r.availableProcessors());    //处理器数量

        System.out.println(r.totalMemory());    //内存总量

        System.out.println(r.freeMemory()); //空闲内存

        Process p = r.exec("calc");  //启动程序
        Thread.sleep(5000); //等待5秒
        p.destroy();
    }
}
