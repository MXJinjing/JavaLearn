package com.itheima.d8_generics_class;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("java1");
        list.add("java2");
//        list.add(123);
        String ele = list.get(1);
        System.out.println(ele);

        MyClass2<String,String> myClass2 = new MyClass2<>();
        myClass2.put("java1", "java2");

        MyClass2<Cat,String> myClass3 = new MyClass2<>();
        myClass3.put(new Cat(),"cat");

    }
}
