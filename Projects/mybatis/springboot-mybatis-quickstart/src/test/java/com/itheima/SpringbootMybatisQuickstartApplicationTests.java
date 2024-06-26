package com.itheima;

import com.itheima.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.itheima.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testListUser() {
        List<User> userList = userMapper.list();
        userList.stream().forEach(user->{
            System.out.println(user);
        });
    }

    @Test
    public void testJdbc() throws SQLException, ClassNotFoundException {
        //1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. 获取连接对象
        String url = "jdbc:mysql://localhost:3306/db02";
        String username = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, username ,password);

        //3. 获取执行SQL的对象Statement，执行SQL，返回结果
        String sql = "select * from user";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        //4. 封装结果数据
        List<User> userList = new ArrayList<>();
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            short age = resultSet.getShort("age");
            short gender = resultSet.getShort("gender");
            String phone = resultSet.getString("phone");
            userList.add(new User(id,name,age,gender,phone));
        }

        userList.stream().forEach(user->{
            System.out.println(user);
        });

        statement.close();
        connection.close();
    }

}
