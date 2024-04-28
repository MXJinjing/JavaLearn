package com.itheima.d16_stringJoiner;

import java.util.StringJoiner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getArrayData(new int[]{11,22,33})) ;
    }
    public static String getArrayData(int[] arr){
        //1. arr == null
        if (arr == null){
            return null;
        }

        //2. arr存在 11,22,33
        StringJoiner s = new StringJoiner(",","[","]");
        for (int i=0; i<arr.length; i++){
            s.add(String.valueOf(arr[i]));
        }
        return s.toString();
    }
}
