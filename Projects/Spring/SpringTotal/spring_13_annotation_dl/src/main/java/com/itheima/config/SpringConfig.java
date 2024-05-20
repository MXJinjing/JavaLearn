package com.itheima.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan({"com.itheima.service","com.itheima.dao"})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
