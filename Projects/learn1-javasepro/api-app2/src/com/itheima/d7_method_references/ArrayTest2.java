package com.itheima.d7_method_references;

import com.itheima.d5_arrays.Student;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("11",177.8,23);
        students[1] = new Student("22",158.0,26);
        students[2] = new Student("33",180.5,33);
        students[3] = new Student("44",168.6,19);

        // 1.对数组排序
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        // 2.重载的sort(arr,Comparator);
//        Arrays.sort(students, (o1,o2)-> Double.compare(o1.getHeight(),o2.getHeight()));
//        Arrays.sort(students, (o1,o2)-> CompareByData.compareByAge(o1,o2));
        Arrays.sort(students, CompareByData::compareByAge);


        //降序
        CompareByData compare = new CompareByData();
//        Arrays.sort(students, ((o1, o2) -> compare.compareByAgeDsc(o1,o2)));
        Arrays.sort(students, compare::compareByAgeDsc);


        System.out.println(Arrays.toString(students));
    }
}
