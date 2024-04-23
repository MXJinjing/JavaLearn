package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        // 1.创建一个ArrayList对象
        ArrayList<String> list = new ArrayList<>();
        list.add("java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            //i = 0 1 2 3 4 5
//            //取出当前数据
//            String ele = list.get(i);
//            if(ele.contains("枸杞")){
//                // 直接从集合中删除该元素
//                list.remove(i);
//            }
//
//        }

        // 方式一：每次删除后，i向左退一步
        for (int i = 0; i < list.size(); i++) {
            //i = 0 1 2 3 4 5
            //取出当前数据
            String ele = list.get(i);
            if(ele.contains("枸杞")){
                // 直接从集合中删除该元素
                list.remove(ele);
                i--;
            }
        }

        // 方式二：倒着遍历
        for( int i = list.size()-1; i >= 0; i--){
            String ele = list.get(i);
            if(ele.contains("枸杞")){
                list.remove(ele);
            }
        }

        System.out.println(list);
    }
}
