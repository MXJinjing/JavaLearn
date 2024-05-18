package com.itheima.d5_arrays;

public class Student implements Comparable<Student>{
    private String name;
    private double height;
    private int age;

    @Override
    public int compareTo(Student o) {
        // 约定1：左边大于右边，返回正整数
        // 约定2: 左边小于右边，返回负整数
        // 约定3： 等于返回0
        // 按照年龄升序排序
//        if(this.age > o.age){
//            return 1;
//        }else if(this.age < o.age){
//            return -1;
//        }else return 0;
        return this.age - o.age;
    }

    @Override
    public String toString(){
        return "Student [name=" + name + ", height=" + height + ", age=" + age + "]";
    }

    public Student(){}

    public Student(String name,double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}