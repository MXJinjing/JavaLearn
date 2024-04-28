package com.itheima.d4_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);

        System.out.println("---------------------------------");

//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));

        // 推荐构造方式
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1);         // +
        BigDecimal c2 = a1.subtract(b1);    // -
        BigDecimal c3 = a1.multiply(b1);    // *
        BigDecimal c4 = a1.divide(b1,4, RoundingMode.HALF_UP);      // /

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
