package com.itheima.d14_integer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        Integer a1 = new Integer(12); //过时
        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

        //自动装箱
        Integer a3 = 12;
        System.out.println(a3);

        //自动拆箱
        int a4 = a3;
        System.out.println(a4);

        //泛型和集合不支持基本数据类型，只能支持引用数据类型
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);   //自动装箱
        list.add(13);   //自动装箱

        int rs = list.get(1);   //自动拆箱
        System.out.println("--------------------------------------");

        // 1.基本数据类型转换为字符串
        Integer a = 23;
        String rs1 = Integer.toString(a);   //23
        System.out.println(rs1+1);  //231

        String rs2 = a.toString();
        System.out.println(rs2 + 1);

        String rs3 = a + "";
        System.out.println(rs3 + 1);

        //2. 把字符串类型转换成基本类型
        String ageStr = "29";
        int ageI = Integer.parseInt(ageStr);
        int ageI2 = Integer.valueOf(ageStr);
        System.out.println(ageI + 1); //30
        System.out.println(ageI2);

        String scoreStr = "99.5";
        double score = Double.parseDouble(scoreStr);
        double score2 = Double.valueOf(scoreStr);
        System.out.println(score + 0.5); //100.0
        System.out.println(score2);
    }
}
