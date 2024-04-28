package com.itheima.d6_abstract_template;

public abstract class People {
    /*
     * 设计模版方法设计模式
     * 1. 定义一个模板方法
     */

    public final void write(){
        System.out.println("\t\t\t\t\t 我的爸爸");
        System.out.println("\t\t来看看我的爸爸有多牛");
        //2. 并不清楚正文怎么写
        writeMain();
        System.out.println("有这样的爸爸太好");
    }

    // 设计一个抽象方法交给子类完成
    public abstract void writeMain();
}
