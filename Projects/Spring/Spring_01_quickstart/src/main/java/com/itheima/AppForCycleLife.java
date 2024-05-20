package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForCycleLife {
    public static void main(String[] args) {
        //3. 获取Ioc容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();
        //4. 获取bean
        BookDao bookDao = (BookDao)ctx.getBean("bookDao");
        bookDao.save();

        //ctx.close();

    }
}
