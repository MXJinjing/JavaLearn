package com.itheima.d15_stringBuilder;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("itheima");

        // 1.拼接内容
        s.append(12);
        s.append("黑马");
        s.append(true);

        //支持链式编程
        s.append(666).append("黑马2").append("666");

        System.out.println(s);

        //2. reverse反转
        s.reverse();
        System.out.println(s);

        //3. 返回字符串的长度
        System.out.println(s.length());

        //4. 转为String类型
        String rs = s.toString();
        System.out.println(rs);
    }
}
