package com.itheima.d5_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysTest1 {
    public static void main(String[] args) {
        // 1.返回数组内容
        int[] arr = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));

        // 2.[start,end)拷贝数组
        int[] arr2 = Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(arr2));

        // 3.拷贝指定长度数组
        int[] arr3 = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr3));

        // 4.setAll
        double[] prices = {99.9,129,100};
        // 价格打八折，存进去
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));

        // 5.排序（默认升序）
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));

    }
}
