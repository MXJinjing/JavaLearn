# Bean管理

## 配置Scope

![image-20240520143850555](./14注解开发bean管理.assets/image-20240520143850555.png)

## 配置生命周期方法

![image-20240520144210657](./14注解开发bean管理.assets/image-20240520144210657.png)

需要依赖：

![image-20240520144222632](./14注解开发bean管理.assets/image-20240520144222632.png)

运行结果：

![image-20240520144809253](./14注解开发bean管理.assets/image-20240520144809253.png)

## 自动装配

#### 引用类型

使用@AutoWired 类型装配

不需要setter方法

![image-20240520145133544](./14注解开发bean管理.assets/image-20240520145133544.png)

按名称装配

指定加载的bean名称 @Qualifier

![image-20240520145329623](./14注解开发bean管理.assets/image-20240520145329623.png)

#### 简单类型

@Value("itheima")

![image-20240520145458548](./14注解开发bean管理.assets/image-20240520145458548.png)

在SpringConfig加载外部properties文件

**多文件可以使用数组，但不支持使用通配符**

![image-20240520145648628](./14注解开发bean管理.assets/image-20240520150125301.png)

![image-20240520150127519](./14注解开发bean管理.assets/image-20240520150127519.png)

在Value中更改为引用

![image-20240520150149843](./14注解开发bean管理.assets/image-20240520150149843.png)



