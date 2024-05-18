package com.itheima.d4_jdk8_time;

import java.time.Instant;

public class Test5_Instant {
    public static void main(String[] args) {
        // 1. 创建Instant对象，获取此刻时间信息
        Instant now = Instant.now();

        // 2. 获取总秒数
        long seconds = now.getEpochSecond();
        System.out.println(seconds);

        // 3. 不够一秒的纳秒数
        int nano = now.getNano();
        System.out.println(nano);

        System.out.println(now);

        // 修改
        Instant instant  = now.plusNanos(111);
        Instant instant1 = now.minusSeconds(20);

    }
}
