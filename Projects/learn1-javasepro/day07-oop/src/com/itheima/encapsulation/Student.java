package com.itheima.encapsulation;

public class Student {
    // 私有不可访问
    private double score;

    public void printPass(){
        System.out.println(score > 60 ? "Passed" : "Failed");
    }

    //getter and setter
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
