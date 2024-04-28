package com.itheima.d10_generics_method;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String rs = test("java");
        System.out.println(rs);

        Dog d = test(new Dog());
        System.out.println(d);

        ArrayList<BWM> bwms = new ArrayList<>();
        bwms.add(new BWM());
        bwms.add(new BWM());
        go(bwms);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        //go(dogs);
    }
    // 泛型方法
    public static <T> T test(T t){
        return t;
    }

    //? 通配符 ? extends Car(上限）
    //        ? super Car（下限）
    public static void go(ArrayList<? extends Car> cars) {}

//    public static <T extends Car> void go(ArrayList<T> cars) {
//
//    }
}
