package com.itheima.parameter;

public class MethodTest4 {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {10,20,30};
        System.out.println(equals(arr1,arr2));
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        // null
        if(arr1 == null && arr2 == null){
            return true;
        }

        // 一个是null
        if(arr1 == null || arr2 == null){
            return false;
        }

        //比较长度
        if(arr1.length != arr2.length){
            return false;
        }

        for(int i = 0; i < arr1.length; i++){
            // 判断对应位置是否相同
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
