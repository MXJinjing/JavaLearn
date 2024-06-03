package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ctx.start();

        BookDao bookDao = ctx.getBean(BookDao.class);
        BookService bookService = ctx.getBean(BookService.class);

        System.out.println(bookDao);
        System.out.println(bookDao.getClass());
        bookDao.save();
        bookDao.update();
    }
}
