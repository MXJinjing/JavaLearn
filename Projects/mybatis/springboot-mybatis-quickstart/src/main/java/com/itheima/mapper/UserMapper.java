package com.itheima.mapper;

import java.util.List;
import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

//在运行时，会自动生成接口的实现类对象，并将对象交给IOC容器管理
@Mapper
public interface UserMapper {

    //查询全部用户信息
    @Select("select * from user")
    public List<User> list();
}
