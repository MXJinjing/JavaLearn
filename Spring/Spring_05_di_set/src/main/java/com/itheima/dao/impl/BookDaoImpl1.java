package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl1 implements BookDao {

    private int connectionNum;
    private String databaseName;

    @Override
    public void save() {
        System.out.println("book dao save..."+connectionNum+databaseName);
    }


    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
