# 动态SQL

如果查询语句中有Null

则无法查到相关数据

![image-20240522222756559](./04动态SQL.assets/image-20240522222756559.png)

![image-20240522222446055](./04动态SQL.assets/image-20240522222446055.png)

## 动态查询功能

### 添加IF标签

test 需要判断的条件

![image-20240522223006043](./04动态SQL.assets/image-20240522223006043.png)

运行结果：

![image-20240522223016453](./04动态SQL.assets/image-20240522223016453.png)

纠错：

只查询性别报错

解决方法：

### 使用where标签替代where

动态添加while，and

![image-20240522223221704](./04动态SQL.assets/image-20240522223221704.png)

![image-20240522223244290](./04动态SQL.assets/image-20240522223244290.png)

运行结果：

![image-20240522223305705](./04动态SQL.assets/image-20240522223305705.png)

## 动态更新员工信息

只更新对应字段的值，不要更新为null

### 使用set标签

![image-20240522224418822](./04动态SQL.assets/image-20240522224418822.png)

运行结果：

![image-20240522224456004](./04动态SQL.assets/image-20240522224456004.png)

## 批量删除功能

### 使用 foreach 循环遍历

colletion：遍历的集合

item：遍历出来的元素

separator：分隔符

open：开始的SQL拼接片段

close：结束的SQL拼接片段

![image-20240522225050645](./04动态SQL.assets/image-20240522225050645.png)

![image-20240522225221832](./04动态SQL.assets/image-20240522225221832.png)

运行结果：

![image-20240522225242445](./04动态SQL.assets/image-20240522225242445.png)

## 使用include

![image-20240522225358052](./04动态SQL.assets/image-20240522225358052.png)

![image-20240522225508972](./04动态SQL.assets/image-20240522225508972.png)

![image-20240522225534969](./04动态SQL.assets/image-20240522225534969.png)

拼接上include标签下可重复使用的SQL片段