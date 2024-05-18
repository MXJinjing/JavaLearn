# Bean生命周期

从创建到消亡的过程

![image-20240519001946212](./05BEAN生命周期.assets/image-20240519001946212.png)

## 创建方法

![image-20240519001134493](./05BEAN生命周期.assets/image-20240519001134493-1716048695004-7.png)

配置xml文件，添加初始化和销毁方法

![image-20240519001207170](./05BEAN生命周期.assets/image-20240519001207170.png)

## 关闭容器

暴力：ctx.close()

设置关闭钩子：ctx.registerShutdownHook()

![image-20240519001527040](./05BEAN生命周期.assets/image-20240519001527040.png)

![image-20240519001540542](./05BEAN生命周期.assets/image-20240519001540542.png)

## 按接口

按接口提供方法，不需要写xml配置

![image-20240519001743611](./05BEAN生命周期.assets/image-20240519001743611.png)

![image-20240519001748503](./05BEAN生命周期.assets/image-20240519001748503.png)

![image-20240519001810312](./../MAVEN/image-20240519001810312.png)