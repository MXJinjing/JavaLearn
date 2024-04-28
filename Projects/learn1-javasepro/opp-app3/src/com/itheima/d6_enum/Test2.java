package com.itheima.d6_enum;

public class Test2 {
    public static void main(String[] args) {
        provideInfo(Constant.BOY);
    }

    public static void provideInfo(Constant sex){
        switch (sex){
            case BOY:
                System.out.println("展示一些信息给男生观看");
                break;
            case GIRL:
                System.out.println("展示一些信息给女生观看");
                break;
        }
    }
}

