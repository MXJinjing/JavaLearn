package com.itheima.string;

public class StringDemo1 {
    public static void main(String[] args) {
        // 1. 直接用引号得到字符串对象
        String name = "itheima";
        System.out.println(name);

        // 2. new String创建对象，并用构造器初始化字符串
        String rs1 = new String();
        System.out.println(rs1);

        String rs2 = new String("itheima");
        System.out.println(rs2);

        char[] chars = {'a','黑','马'};
        String rs3 = new String(chars);
        System.out.println(rs3);

        byte[] bytes1 = {97,98,99};
        String rs4 = new String(bytes1);
        System.out.println(rs4);
    }
}
