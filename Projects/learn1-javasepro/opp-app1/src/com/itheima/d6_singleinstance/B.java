package com.itheima.d6_singleinstance;

public class B {
    private static B b;

    private B() {   }

    //定义类方法，保证第一次调用创建，其他返回
    public static B getInstance() {
        if(b == null) {
            b = new B();
        }
        return b;
    }
}
