package com.itheima.d14_extends_constructor;

import org.w3c.dom.ls.LSOutput;

public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("李四",36,"JAVA");
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSkill());
    }
}

class Teacher extends People {
    private String skill;

    public Teacher(String name,int age,String skill) {
        super(name,age);    //调用父类的有参构造器
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void printInfo(){
        System.out.println(getName() + "具备的技能" + skill);
    }
}


class People {
    private String name;
    private int age;

    public People(String name,int age) {
        this.name = name;
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
}

