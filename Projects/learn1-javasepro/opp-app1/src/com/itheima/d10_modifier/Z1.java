package com.itheima.d10_modifier;

import com.itheima.d9_modifier.Fu;

public class Z1 extends Fu {
    public void test(){
        //privateMethod();  不能访问
        //method(); 不能访问
        protectedMethod();
        publicMethod();
    }
}
