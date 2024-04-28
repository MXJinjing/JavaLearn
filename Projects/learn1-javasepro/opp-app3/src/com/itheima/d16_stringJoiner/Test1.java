package com.itheima.d16_stringJoiner;

import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        StringJoiner s = new StringJoiner(",");
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s);
    }
}
