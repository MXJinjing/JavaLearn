package com.itheima.d12_api_object;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("赵敏",123);
        System.out.println(s1.toString());

        Student s2 = new Student("赵敏",123);
        System.out.println(s2.equals(s1));
        System.out.println(s2 == s1);

    }
}
