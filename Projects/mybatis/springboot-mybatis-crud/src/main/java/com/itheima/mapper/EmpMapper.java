package com.itheima.mapper;


import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    //根据ID删除数据
    @Delete("delete from emp where id=#{id}")
    public int delete(int id);

    public void deleteByIds(List<Integer> ids);

    //插入数据
    @Options(keyProperty = "id",useGeneratedKeys = true)
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
            "VALUES (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime});")
    public int insert(Emp emp);

    //更新数据
    @Update("UPDATE emp set username=#{username}, name=#{name}, gender=#{gender}, image=#{image}, job=#{job}, entrydate=#{entrydate}, dept_id=#{deptId}, update_time=#{updateTime}\n" +
            "where id=#{id};")
    public void update(Emp emp);

    public void update2(Emp emp);

    //根据ID查询员工
    @Results({
            @Result(column = "dept_id", property = "deptId"),
            @Result(column = "update_time", property = "updateTime"),
            @Result(column = "create_time", property = "createTime")
    })
    @Select("select * from emp where id=#{id}")
    public Emp selectById(int id);

    //可能是多条记录
    //条件查询员工
//    @Select("select * from emp where name like concat('%',#{name},'%') and gender=#{gender} and entrydate between #{begin} and #{end} order by  update_time desc;")
//    public List<Emp> list(String name,Short gender, LocalDate begin, LocalDate end);

    public List<Emp> list(String name,Short gender, LocalDate begin, LocalDate end);
}
