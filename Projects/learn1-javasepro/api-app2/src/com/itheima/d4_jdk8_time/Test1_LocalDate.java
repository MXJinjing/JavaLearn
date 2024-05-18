package com.itheima.d4_jdk8_time;

import java.time.LocalDate;

public class Test1_LocalDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // 1.获取日期对象中的信息
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();
        int dayOfWeek = ld.getDayOfWeek().getValue();

        System.out.println(year);
        System.out.println(day);
        System.out.println(dayOfWeek);

        // 2. 直接修改某个信息：with..
        LocalDate ld2 = ld.withYear(2099);  //不可变对象
        LocalDate ld3 = ld2.withMonth(12);
        System.out.println(ld2);
        System.out.println(ld3);

        // 3. 加多少 plus...
        LocalDate ld4 = ld.plusYears(2);
        LocalDate ld5 = ld.plusMonths(2);

        // 4. 减多少 minus
        LocalDate ld6 = ld.minusYears(2);
        LocalDate ld7 = ld.minusMonths(2);

        // 5. 获取指定日期的LocalDate对象
        LocalDate ld8 = LocalDate.of(2099,12,3);
        LocalDate ld9 = LocalDate.of(2099,12,3);

        // 6. 判断相同
        System.out.println(ld8.equals(ld9));
        System.out.println(ld6.equals(ld7));
    }
}
