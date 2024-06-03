package com.itheima;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete(){
        int delete = empMapper.delete(16);
        System.out.println(delete);
    }

    @Test
    public void deleteByIds(){
        List<Integer> ids = Arrays.asList(13,14,15);
        empMapper.deleteByIds(ids);
    }

    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setUsername("Tom3");
        emp.setName("汤姆3");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        //执行新增员工操作
        empMapper.insert(emp);
        System.out.println(emp.getId());
    }

    @Test
    public void testUpdate(){
        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("Tom1");
        emp.setName("汤姆1");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.update(emp);
    }

    @Test
    public void testUpdate2(){
        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("Tom111");
        emp.setName("汤姆111");
        emp.setGender((short)2);
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.update2(emp);
    }

    @Test
    public void testSelectById(){
        Emp emp = empMapper.selectById(15);
        System.out.println(emp);
    }

    @Test
    public void testList(){
        List<Emp> emps = empMapper.list("张",(short) 1,LocalDate.of(2010,1,1),LocalDate.of(2020,1,1));
        emps.forEach(System.out::println);
    }

    @Test
    public void testList2(){
        List<Emp> emps = empMapper.list(null,(short)1,null,null);
        emps.forEach(System.out::println);
    }
}

