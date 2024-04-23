package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1. 创建一个ArrayList的集合对象
        ArrayList<String> list = new ArrayList<String>();
        list.add("黑马");
        list.add("黑马");
        list.add("Java");
        System.out.println(list);

        //2. 往某个索引位置处天年假一个数据
        list.add(1,"mySQL");
        System.out.println(list);

        //3. 根据索引获取值
        String rs = list.get(1);
        System.out.println(rs);

        //4. 返回集合中元素个数
        System.out.println(list.size());

        //5. 索引删除元素，并返回被删除的元素值
        System.out.println(list.remove(1));
        System.out.println(list);

        //6. 删除某个元素值，成功ture
        System.out.println(list.remove("Java"));
        System.out.println(list);

        list.add("html");
        System.out.println(list);

        //默认删除第一次出现的黑马的数据
        System.out.println(list.remove("黑马"));
        System.out.println(list);

        //7. 修改某个索引的位置，修改后返回原来的值
        System.out.println(list.set(1, "黑马程序员"));
        System.out.println(list);

    }
}
