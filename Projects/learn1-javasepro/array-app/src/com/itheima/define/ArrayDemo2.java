package com.itheima.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {12,24,36};

        // 1. 访问数组的全部数据
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);

        // 2. 修改数组的数据
        arr[0] = 6;
        arr[2] = 100;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 3. 元素个数
        System.out.println(arr.length);

        //获取最大索引(非空）
        System.out.println(arr.length - 1);
    }
}
