# 数据库查询语句DQL

关键字：SELECT

select from where 

group by 

having 

order by 

limit

## 分组查询

group by

```mysql
select job, count(*)
from tb_emp
where entrydate <= '2015-01-01'
and group by job have count(*) >= 2;
```

## 排序查询

order by

- 升序：ASC
- 降序：DESC

```mysql
Select * from tb_emp
order by entrydate;

Select * from tb_emp
order by entrydate , update_time desc;
```

## 分页查询

limit 分页参数

起始索引，查询记录数

分页：第一页、第二页、第三页

```mysql
select * from tb_emp
limit 0,5

select * from tb_emp
limit 5,5

select * from tb_emp
limit 10,5
```

