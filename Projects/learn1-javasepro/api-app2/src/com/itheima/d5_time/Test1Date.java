package com.itheima.d5_time;

import java.util.Date;

public class Test1Date {
    public static void main(String[] args) {
        // 1. 代表系统当前时间信息
        Date d = new Date();
        System.out.println(d);

        // 2. 拿到时间毫秒值
        long time = d.getTime();
        System.out.println(time);

        // 3. 时间毫秒值转化为日期对象
        time += 2*1000;
        Date d2 = new Date(time);
        System.out.println(d2); // 2秒后的日期对象

        //4. setTime修改日期对象
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);
    }
}
