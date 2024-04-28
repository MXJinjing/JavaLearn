package com.itheima.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        //解耦合，右边对象可以随时切换
        People p1 = new Student();
        p1.run();
        //p1.test();

        //强制类型转换
        Student s1 = (Student) p1;
        s1.test();

        if(p1 instanceof Student) {
            Student s2 = (Student) p1;
            s2.test();
        }else{
            Teacher t2 = new Teacher();
            t2.teach();
        }
        //编译阶段有继承或者实践关系就可以强制转换，但运行时可能会出现转换异常
        //Teacher t1 = (Student) p1;    //ClassCastException

        //p instanceof Student


        // 父类对象类型的变量作为形参
        Student s = new Student();
        go(s);
        Teacher t = new Teacher();
        go(t);

    }

    public static void go (People p) {

    }
}
