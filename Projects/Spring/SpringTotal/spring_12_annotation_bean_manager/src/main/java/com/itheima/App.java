package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.itheima.dao.BookDao;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.itheima.config.SpringConfig.class);
        BookDao bookdao = (BookDao) ctx.getBean(BookDao.class);
        System.out.println(bookdao);
        ctx.close();
    }
}
