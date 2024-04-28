package com.itheima.d5_inner_class5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        // GUI编程
        // 1.创建窗口
        JFrame win = new JFrame("登录界面");

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        // 给按钮绑定单击事件
//        btn.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win,"登录一下");
//            }
//        });
        //简化
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win,"登录一下"));

        win.setSize(400,400);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);


    }
}
