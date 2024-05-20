package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl1 implements BookDao {

    private int connectionNum;
    private String databaseName;

    @Override
    public void save() {
        System.out.println("book dao save..."+connectionNum+databaseName);
    }

    public BookDaoImpl1(int connectionNum, String databaseName){
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }
}
