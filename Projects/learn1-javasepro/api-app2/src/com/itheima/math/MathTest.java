package com.itheima.math;

public class MathTest {
    public static void main(String[] args) {
        //1. 取绝对值
        System.out.println(Math.abs(-12));
        System.out.println(Math.abs(123));
        System.out.println(Math.abs(-3.14));

        //2. 向上取整
        System.out.println(Math.ceil(4.0000001));
        System.out.println(Math.ceil(4.0));

        //3. 向下取整
        System.out.println(Math.floor(4.999999));
        System.out.println(Math.floor(4.0));

        //4. 四舍五入
        System.out.println(Math.round(3.499999));
        System.out.println(Math.round(3.500001));

        //5. 最大值，最小值
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));

        //6. 幂
        System.out.println(Math.pow(2, 3)); //2^3
        System.out.println(Math.pow(3, 2)); //3^2

        //6.随机数[0.0,1.0)
        System.out.println(Math.random());
    }
}
