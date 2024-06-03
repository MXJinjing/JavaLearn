

# 数据库设计 DDL语句



## 数据库

1. 查看所有数据库

```mysql
show databases;
```

![image-20240520155831561](./D02SQL语句DDL.assets/image-20240520155831561.png)

2. 创建数据库

```mysql
create database db03;
create database db01 if not exists db01;
```

![image-20240520155859041](./D02SQL语句DDL.assets/image-20240520155859041.png)

![image-20240520155945980](./D02SQL语句DDL.assets/image-20240520155945980.png)

3. 使用数据库

```mysql
use db01;
```

![image-20240520160209236](./D02SQL语句DDL.assets/image-20240520160209236.png)

3. 查看当前正在使用的数据库

```mysql
select database();
```

![image-20240520160017695](./D02SQL语句DDL.assets/image-20240520160017695.png)

4. 删除数据库

```mysql
drop database db03;
```

![image-20240520160103899](./D02SQL语句DDL.assets/image-20240520160103899.png)

## 表结构

1. 创建表结构

```mysql
CREATE table ()
```

![image-20240520161651675](./D02SQL语句DDL.assets/image-20240520161651675.png)

2. 添加数据图形化

![image-20240520161726229](./D02SQL语句DDL.assets/image-20240520161726229.png)

3. 添加约束

![image-20240520162324076](./D02SQL语句DDL.assets/image-20240520162324076.png)

4. 查询数据库所有表

```mysql
show tables;
```

5. 查看指定表结构

```mysql
desc tb_uesr;
```

![image-20240520162942482](./D02SQL语句DDL.assets/image-20240520162942482.png)

6. 查看数据建表语句

```mysql
show create table tb_user;
```

![image-20240520163017849](./D02SQL语句DDL.assets/image-20240520163017849.png)

7. 添加字段

```mysql
alter table tb_user add qq varchar(11) comment 'QQ';
```

8. 修改字段

```mysql
alter table tb_user modify qq varchar(13) comment 'QQ';
```

```mysql
alter table tb_user change qq qq_num varchar(13) comment 'QQ';
```

9. 删除字段

```mysql
alter table tb_user drop column qq_num;
```

10. 重命名表

```mysql
rename table tb_user to tb_user2;
```



## 数据类型

1. 数值类型

![image-20240520162557323](./D02SQL语句DDL.assets/image-20240520162557323.png)

2. 字符串类型

VARCHAR 变长字符串

CHAR 定长字符串

3. 日期类型

![image-20240520162647110](./D02SQL语句DDL.assets/image-20240520162647110.png)



# mysql图形化管理工具

NaviCat

DataGrip

等

## 使用IDEA

![image-20240520161024385](./D02SQL语句DDL.assets/image-20240520161024385.png)

![image-20240520161043586](./D02SQL语句DDL.assets/image-20240520161043586.png)

![image-20240520161113528](./D02SQL语句DDL.assets/image-20240520161113528.png)
