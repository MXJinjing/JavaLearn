package com.itheima.d4_jdk8_time;

import java.time.LocalTime;

public class Test2_LocalTime {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(2);

        // 时间在前后
        System.out.println(lt.isBefore(lt2));
        System.out.println(lt.isAfter(lt2));
    }
}
