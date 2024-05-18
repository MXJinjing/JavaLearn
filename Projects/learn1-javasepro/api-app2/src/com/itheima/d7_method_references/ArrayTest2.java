package com.itheima.d5_arrays;

import java.lang.reflect.Array;
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
        Arrays.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                // 约定1：左边大于右边，返回正整数
                // 约定2: 左边小于右边，返回负整数
                // 约定3： 等于返回0
//                if(o1.getHeight() > o2.getHeight()){
//                    return 1;
//                }else if(o1.getHeight() < o2.getHeight()){
//                    return -1;
//                }else
//                return 0;
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });

        System.out.println(Arrays.toString(students));
    }
}
