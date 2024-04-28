package com.itheima.d7_generics;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add(new Cat());

//        for (int i = 0; i < list.size(); i++) {
//            String e = (String) list.get(i);
//            System.out.println(e);
//            //第四个报错
//        }


        System.out.println("-------------------------");
        ArrayList<String> list2 = new ArrayList<String>();  //1.7+后面可以不声明
        list2.add("java1");
        list2.add("java2");
        list2.add("java3");
//        list2.add(new Cat());

        for (int i = 0; i < list2.size(); i++) {
            String e = (String) list2.get(i);
            System.out.println(e);
            //第四个报错
        }
    }
}

class Cat{}