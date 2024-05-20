package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {
    BookDao bookDao;
    UserDao userDao;

    @Override
    public void save() {
        System.out.println("Book Service Save");
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public void setUserDao(UserDao userDao) { this.userDao = userDao; }
}
