package com.itheima.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    // 1.定义一个arraylist存储菜品信息
    private ArrayList<Food> foodlist = new ArrayList<>();

    public FoodOperator() {}

    public FoodOperator(ArrayList<Food> foodlist) {
        this.foodlist = foodlist;
    }

    // 2. 上架功能
    public void addFood() {
        // 3. 创建一个菜品对象，封装信息
        Food f = new Food();

        // 4. 录入信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入菜品名称");
        String name = sc.next();
        f.setName(name);

        System.out.println("请您输入菜品价格");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("请您输入菜品描述");
        String desc = sc.next();
        f.setDesc(desc);

        // 5. 添加到集合
        foodlist.add(f);
        System.out.println("上架成功！");
    }

    //6. 展示菜品
    public void showAllFoods(){
        for (int i = 0; i < foodlist.size(); i++) {
            Food f = foodlist.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("---------------");
        }
    }

    // 负责展示操作界面
    public void start(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择功能");
            System.out.println("1.上架菜品");
            System.out.println("2.展示菜品");
            System.out.println("3.退出");

            String command = sc.next();
            switch (command) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("下次再来哦");
                    return;
                default:
                    System.out.println("输入的命令不存在");
            }
        }
    }
}
