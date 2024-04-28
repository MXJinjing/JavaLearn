package com.itheima.d12_api_object;

public class Student {
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student {name=" + name + ", age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        // 1.判断地址是否一样
        if (this == o) return true;
        // 2.判断null，类型是否一样
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        // 3.判断成员变量是否一样
        return age == student.age && name.equals(student.name);
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
