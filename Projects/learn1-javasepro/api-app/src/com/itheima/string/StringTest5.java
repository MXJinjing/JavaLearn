package com.itheima.string;

import java.util.Random;

public class StringTest5 {
    public static void main(String[] args) {
        System.out.println(createCode(4));
        System.out.println(createCode(10));
    }
    /*
     *  1. 设计一个方法，返回指定位数的验证码
     */
    public static String createCode(int n){
        // 2. 定义一个变量，一个记住最终产生的，一个定义全部字符
        String code = "";
        String data = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";

        Random r = new Random();
        // 3. 循环产生随机字符
        for (int i = 0; i < n; i++) {
            // 4. 随机一个字符范围内的索引
            int index = r.nextInt(data.length());
            // 5. 根据索引去全部字符中提取子字符
            code += data.charAt(index);
        }
        // 6. return
        return code;
    }
}
