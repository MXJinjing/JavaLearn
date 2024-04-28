package com.itheima.d6_abstract_template;

public class Test {
    public static void main(String[] args) {
        // 目标：搞清楚抽象类的应用场景之一，经常用来设计模版方法设计模式
        // 场景：学生、老师都要写一篇作文，我的爸爸
        // 第一段一样，最后一段一样
        // 正文不一样
        Teacher t = new Teacher();
        t.write();

        Student s = new Student();
        s.write();
    }
}
