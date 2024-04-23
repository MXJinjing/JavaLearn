package com.itheima.pkg;

import com.itheima.pkg.itcast.Demo1;
import com.itheima.pkg.itheima.Demo2;

import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //同一路径下不需要导包
        Demo d = new Demo();
        d.print();

        //Demo 1 需要导包使用
        Demo1 d2 = new Demo1();
        d2.print();

        //使用Java提供的程序也要导包
        //Java.lang下的不需要导包
        Scanner sc = new Scanner(System.in);
        String s = "";
        Random r = new Random();

        //名称重复默认只能导入一个
        Demo2 d3 = new Demo2();
        d3.print();

        //需要完整路径
        com.itheima.pkg.itcast.Demo2 d4 = new com.itheima.pkg.itcast.Demo2();
        d4.print();
    }
}
