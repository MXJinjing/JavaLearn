package com.itheima.d7_method_references;

import com.itheima.d5_arrays.Student;

public class CompareByData {
    public static int compareByAge(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }

    public int compareByAgeDsc(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    }
}
