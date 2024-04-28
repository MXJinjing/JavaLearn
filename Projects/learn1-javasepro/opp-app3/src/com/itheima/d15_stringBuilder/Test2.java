package com.itheima.d15_stringBuilder;

public class Test2 {
    public static void main(String[] args) {
//        String rs = "";
//        for (int i = 0; i < 1000000; i++) {
//            rs = rs + "abc";
//        }
//        System.out.println(rs);

        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 1000000; i++) {
            s = s.append("abc");
        }
        System.out.println(s);

    }
}
