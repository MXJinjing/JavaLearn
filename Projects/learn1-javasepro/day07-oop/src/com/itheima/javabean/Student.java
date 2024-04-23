package com.itheima.javabean;

public class Student {
    // 1. 必须私有化成员变量
    private String name;
    private double scores;

    // 2. 必须有无参构造器
    public Student() {
    }

    public Student(String name, double scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

}
