# MyBatis基础

员工信息的增删改查

## 环境准备

![image-20240522205324711](./02MyBatis基础.assets/image-20240522205324711.png)

## 删除数据



预编译SQL：#{id}占位符

更安全、高效

防止SQL注入

拼接SQL：${id} 对表名，字段名动态设置

![image-20240522210935207](./02MyBatis基础.assets/image-20240522210935207.png)

![image-20240522210951722](./02MyBatis基础.assets/image-20240522210951722.png)

## 新增数据

Insert语句

写入的是属性名（驼峰）	

![image-20240522212628132](./02MyBatis基础.assets/image-20240522212628132.png)

主键返回

数据添加后，获取插入数据库数据的主键

返回23

![image-20240522212752775](./02MyBatis基础.assets/image-20240522212752775.png)

![image-20240522212912980](./02MyBatis基础.assets/image-20240522212912980.png)

![image-20240522212930705](./02MyBatis基础.assets/image-20240522212930705.png)

## 更新数据

更新操作

![image-20240522213628813](./02MyBatis基础.assets/image-20240522213628813.png)

![image-20240522214130226](./02MyBatis基础.assets/image-20240522214130226.png)

## 通过ID查询数据

![image-20240522214307521](./02MyBatis基础.assets/image-20240522214307521.png)

类名与属性名不一致，不能封装

1. 给字段起别名

```mybatis
select id, username, password, name, gender, image, job, entrydate, dept_id deptId, create_time createTime, update_time updateTime from emp where id=#{id};
```

2. 手动映射封装

​	column：表中字段名；property：类属性名

![image-20240522214838038](./02MyBatis基础.assets/image-20240522214838038.png)

3. 驼峰命名自动映射开关

![image-20240522214931356](./02MyBatis基础.assets/image-20240522214931356.png)

## 列表条件查询

```mybatis
select * from emp where name like '%${name}%' and gender=#{gender} and entrydate between #{begin} and #{end} order by  update_time desc;
```

不用拼接字符串：使用concat

concat('%',#{name},'%')

```mybatis
select * from emp where name like concat('%',#{name},'%') and gender=#{gender} and entrydate between #{begin} and #{end} order by  update_time desc;
```



![image-20240522215520671](./02MyBatis基础.assets/image-20240522215520671.png)

![image-20240522215657444](./02MyBatis基础.assets/image-20240522215657444.png)

查询结果：

![image-20240522215727687](./02MyBatis基础.assets/image-20240522215727687.png)

