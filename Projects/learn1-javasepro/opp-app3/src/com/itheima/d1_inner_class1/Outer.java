package com.itheima.d1_inner_class1;

public class Outer {
    private int age = 99;
    public static String a;
    public class Inner{
        int age = 88;
        private String name;
        public static String schoolName;//jdk16+

        public void test(){
            System.out.println(age);    //访问外部类的成员
            System.out.println(a);

            int age = 66;
            System.out.println(age);    //66
            System.out.println(this.age);   //88
            System.out.println(Outer.this.age); //99
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
