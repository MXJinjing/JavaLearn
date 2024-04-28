package com.itheima.d9_generics_interface;

import com.itheima.d8_generics_class.Animal;

import java.util.ArrayList;

//泛型接口
public interface Data<T> {
    void add(T t);
    ArrayList<T> getByName(String name);
}
