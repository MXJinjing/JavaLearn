package com.itheima.d7_method_references;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        String[] names = {"boby","angle","Andy","caocao","jack","Cici","dlei"};


        // 进行排序
        Arrays.sort(names);

        //忽略首字符大小写进行排序
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
//        Arrays.sort(names,(o1,o2)->o1.compareToIgnoreCase(o2));
        Arrays.sort(names,String::compareToIgnoreCase);



        System.out.println(Arrays.toString(names));
    }
}
