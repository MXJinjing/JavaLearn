package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

public class JdbcConfig {

    @Value("com.mysql.jdbc.")
    private String driver;
    @Value("jdbc://")
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;
    //1. 定义一个方法获得要管理的类
    //2. 添加@Bean，表示该方法的返回值是一个bean
    @Bean
    public DataSource dataSource(BookDao bookDao) {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
