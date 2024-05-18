# Bean实例化

Bean本质上是对象吗，创建bean使用构造方法完成

## 调用无参构造方法

private、public都能调用

![image-20240518235835175](./04BEAN实例化.assets/image-20240518235835175-1716047942234-3.png)

## 通过静态工厂

兼容早期遗留

![](./04Bean实例化.assets/image-20240519000144701.png)

bean 配置中 

class="factory"

factory-method="getOrderDao"

![image-20240519000257961](./04Bean实例化.assets/image-20240519000257961.png)

## 通过实例工厂

通过工厂的对象调用对象

![image-20240519000516379](./04Bean实例化.assets/image-20240519000516379.png)

1. 先造一个工厂对象bean

2. 再造对象bean，配置factory-bean\factory-method

![image-20240519000449670](./04Bean实例化.assets/image-20240519000449670.png)

## 改良：使用FactoryBean实例化bean

1. 在工厂同包下建一个FactoryBean类的继承类
2. 创建对象bean

![image-20240519000717980](./04Bean实例化.assets/image-20240519000717980.png)

![image-20240519000820633](./04Bean实例化.assets/image-20240519000820633-1716048501111-5.png)

改为非单例：

![image-20240519000902568](./04Bean实例化.assets/image-20240519000902568.png)