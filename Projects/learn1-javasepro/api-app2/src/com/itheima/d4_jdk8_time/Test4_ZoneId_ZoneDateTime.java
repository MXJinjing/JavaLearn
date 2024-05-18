package com.itheima.d4_jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test4_ZoneId_ZoneDateTime {
    public static void main(String[] args) {
        // 1. 获取系统的时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());
        System.out.println(zoneId);

        // 列出全部时区
        System.out.println(ZoneId.getAvailableZoneIds());

        // 获取时区
        ZoneId zoneId1 = ZoneId.of("America/New_York");

        // 2. 获得带时区的时间
        ZonedDateTime now = ZonedDateTime.now(zoneId1);
        System.out.println(now);

        // 世界标准时间
        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1);

        // 系统默认时区
        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);

    }
}
