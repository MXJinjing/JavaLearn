package com.itheima.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        String week = "周三";
        switch (week) {
            case "周一":
            case "周二":
            case "周三":
                System.out.println("修bug");
                break;
            case "周四":
            case "周五":
                System.out.println("帮忙");
                break;
            case "周六":
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("000");
                break;
        }
    }
}
