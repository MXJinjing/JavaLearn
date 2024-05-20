package com.itheima.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;



@Configuration
@Import({JdbcConfig.class})
@ComponentScan("com.itheima.dao")
public class SpringConfig {


}
