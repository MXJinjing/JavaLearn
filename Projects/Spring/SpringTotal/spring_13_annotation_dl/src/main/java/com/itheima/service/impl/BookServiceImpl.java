package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookDao2")
    private BookDao bookDao;

    @Value("${jdbc.name}")
    private String name;

    @Override
    public void save() {

    }
}
