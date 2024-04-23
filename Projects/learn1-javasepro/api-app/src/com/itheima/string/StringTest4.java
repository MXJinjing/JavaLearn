package com.itheima.string;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        // 1.登录界面
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入登录名称：");
            String loginName = sc.next();
            System.out.println("请您输入登录密码");
            String password = sc.next();

            //5. 调用方法
            boolean rs = login(loginName, password);
            if (rs) {
                System.out.println("欢迎进入系统");
                break;
            }else {
                System.out.println("登录名或密码错误");
            }
        }
    }


    /*
    * 2. 开发一个登陆的方法，接受用户名密码，返回认证结果
    * */
    public static boolean login(String loginName, String password) {
        // 3. 准备正确的用户名密码
        String okLoginName = "itheima";
        String okPassword = "123456";

        // 4. 判断用户是否登录成功
        return loginName.equals(okLoginName) && password.equals(okPassword);
    }
}
