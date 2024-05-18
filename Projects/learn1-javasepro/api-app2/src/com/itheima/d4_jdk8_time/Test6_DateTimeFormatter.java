package com.itheima.d4_jdk8_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6_DateTimeFormatter {
    public static void main(String[] args) {
        // 1. 创建一个日期时间格式化器对象出来
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        // 2. 对时间格式化
        LocalDateTime now = LocalDateTime.now();

        String rs = formatter.format(now);  // 正向格式化
        System.out.println(rs);

        // 3. 结果一致
        String rs2 = now.format(formatter); // 反向格式化
        System.out.println(rs2);

        // 4. 解析时间
        String dateStr = "2024年04月29日 19:15:29";
        LocalDateTime ldt = LocalDateTime.parse(dateStr, formatter);
        System.out.println(ldt);
    }
}
