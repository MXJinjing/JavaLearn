package com.itheima.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.itheima"})
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
public class SpringConfig {

}
