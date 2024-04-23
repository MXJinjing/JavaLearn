package com.itheima.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        printHelloWorld(3);
        printHelloWorld(3);
    }

    public static void printHelloWorld(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }
}
