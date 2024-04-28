package com.itheima.d13_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "itheima";

        // S1 是 null 会报错
//        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2)); //更安全

        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));

        System.out.println(Objects.nonNull(s1));
        System.out.println(Objects.nonNull(s2));
    }
}
