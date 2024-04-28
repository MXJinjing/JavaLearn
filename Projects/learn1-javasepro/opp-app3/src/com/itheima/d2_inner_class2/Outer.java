package com.itheima.d2_inner_class2;

public class Outer {
    private int age;
    public static String schoolName;
    public static class Inner {
        private String name;
        public static int a;

        public void test(){
            //能访问静态成员
            System.out.println(schoolName);
            //不能访问实例成员
            //System.out.println(age);
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

    public static void test2(){
        System.out.println(schoolName);
        //System.out.println(age);
    }
}
