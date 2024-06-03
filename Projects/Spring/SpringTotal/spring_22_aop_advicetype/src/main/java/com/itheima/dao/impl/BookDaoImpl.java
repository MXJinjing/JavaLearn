package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookDao save...");
    }

    @Override
    public void update(){
        System.out.println("bookDao update...");
    }

    @Override
    public int[] findByName(String name){
        System.out.println("bookDao findByName...");
        int[] a = new int[]{1,2,3,4,5};
        return a;
    }
}
