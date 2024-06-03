# Spring整合Mybatis

## 思路分析

![image-20240522230135635](./17Spring整合MyBatis.assets/image-20240522230135635.png)

最核心：SqlSessionFactory

配置文件

![image-20240522230250566](./17Spring整合MyBatis.assets/image-20240522230250566.png)

## 案例

所有需要的依赖：

```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>6.1.6</version>
        </dependency>

        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.14</version>
        </dependency>

        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <version>8.3.0</version>
        </dependency>

        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
            <version>1.2.19</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>6.1.6</version>
        </dependency>

        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
            <version>3.0.3</version>
        </dependency>
    </dependencies>
```

JDBC配置：

获取DataSource类

![image-20240522232342717](./17Spring整合MyBatis.assets/image-20240522232342717.png)





## 直接构造SQLSessionFactory

![image-20240522232150485](./17Spring整合MyBatis.assets/image-20240522232150485.png)
