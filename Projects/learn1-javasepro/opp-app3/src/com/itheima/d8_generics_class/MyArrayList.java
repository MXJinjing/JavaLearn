package com.itheima.d8_generics_class;

public class MyArrayList<E> {
    Object[] arr = new Object[10];
    private int size;

    public MyArrayList() {
        this.size = 0;
    }

    public boolean add(E e) {
        arr[size++] = e;
        return true;
    }

    public E get(int index) {
        return (E) arr[index];
    }
}
