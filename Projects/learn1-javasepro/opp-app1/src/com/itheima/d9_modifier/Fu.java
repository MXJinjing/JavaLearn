package com.itheima.d9_modifier;

public class Fu {
    private void privateMethod(){
        System.out.println("===private===");
    }

    void method(){
        System.out.println("-===缺省===");
    }

    protected void protectedMethod(){
        System.out.println("===protected===");
    }

    public void publicMethod(){
        System.out.println("===public===");
    }

    // 本类中都可以访问
    public void test(){
        privateMethod();
        method();
        protectedMethod();
        publicMethod();
    }
}
