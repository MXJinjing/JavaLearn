package com.itheima.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 静态定义
        // 数据类型[]  数组名 = new 数组类型[]{元素1,2,3}
        int[] ages = new int[]{12,24,36};
        double[] scores = new double[]{89.9,99.5,34.5,43.1};

        // 简化写法
        int[] age2 = {12,24,36};
        double[] score2 = {89.9,99.5,34.5,43.1};

        // 中括号放在数组名后面（C-style）
        int ages3[] = new int[]{12,24,36};
        double scores3[] = new double[]{89.9,99.5,34.5,43.1};
    }
}
