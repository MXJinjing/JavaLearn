package com.itheima.d10_modifier;

import com.itheima.d9_modifier.Fu;

public class Demo2{
    public static void main(String[] args){
        Fu f = new Fu();
        //f.privateMethod();  不能访问
        //f.method(); 不能访问
        //f.protectedMethod();
        f.publicMethod();
    }
}
