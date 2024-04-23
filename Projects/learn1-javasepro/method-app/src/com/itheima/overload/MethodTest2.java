package com.itheima.overload;

public class MethodTest2   {
    public static void main(String[] args) {
        fire();
        fire("A");
        fire("A",999);
    }

    public static void fire(){
        System.out.println("发射了1武器");
    }

    public static void fire(String country){
        System.out.println("发射了1武器给" + country);
    }

    public static void fire(String country,int number){
        System.out.println("发射了"+ number+"武器给"+country);
    }
}
