package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bookDao2")
@Scope("singleton")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {

    }

    @PostConstruct
    public void init(){
        System.out.println("Book Dao init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Book Dao destroy");
    }
}
