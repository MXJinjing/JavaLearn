package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("播妞");
        s1.setScores(99);
        System.out.println(s1.getName());
        System.out.println(s1.getScores());

        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();
    }
}
