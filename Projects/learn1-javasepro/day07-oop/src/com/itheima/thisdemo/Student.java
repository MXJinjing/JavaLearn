package com.itheima.thisdemo;

public class Student {
    double score;
    public void printThis(){
        System.out.println(this);
    }

    public void printPass(double score){
        if(score > this.score){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}