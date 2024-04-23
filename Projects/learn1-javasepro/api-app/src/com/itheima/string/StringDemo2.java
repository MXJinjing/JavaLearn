package com.itheima.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "黑马Java";
        //1. 获取长度
        System.out.println(s.length());

        //2. 提取索引位置字符
        System.out.println(s.charAt(1));

        //字符串的遍历
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        //3.转为字符数组
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //4.判断内容一样返回true
        String s1 = "黑马";
        String s2 = "黑马";

        System.out.println(s1 == s2);   //内存 false
        System.out.println(s1.equals(s2));  //true

        //5.忽略大小写比较字符串内容
        String c1 = "34AeFG";
        String c2 = "34aEfG";
        System.out.println(c1.equals(c2));  //false
        System.out.println(c1.equalsIgnoreCase(c2));    //true

        //6.截取字符串内容
        String s3 = "Java是最好的编程语言之一";
        String rs = s3.substring(0,8);
        System.out.println(rs);

        //7.从当前索引截取到末尾
        String rs2 = s3.substring(5);
        System.out.println(rs2);

        //8.某个内容替换新内容返回新的字符串
        String info = "这个电影简直是个垃圾";
        String rs3 = info.replace("垃圾","**");
        System.out.println(rs3);

        //9.判断是否包含关键字
        String info2 = "Java是最好的编程语言之一，我爱Java";
        System.out.println(info2.contains("Java"));
        System.out.println(info2.contains("java"));
        System.out.println(info2.contains("java2"));

        //10.判断是否某个字符串开头
        String rs4 = "张三丰";
        System.out.println(rs4.startsWith("张"));
        System.out.println(rs4.startsWith("张三"));
        System.out.println(rs4.startsWith("张三2"));

        //11.分隔开为字符串数组
        String rs5 = "张无忌，周芷若，殷素素，赵敏";
        String[] names = rs5.split("，");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
