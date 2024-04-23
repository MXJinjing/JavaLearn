package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //自动导入包

        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        System.out.println("您的年龄是："+age);

        System.out.println("请输入你的名字");
        String name = sc.next();
        System.out.println(name + "欢迎您进入系统~~");
    }
}
