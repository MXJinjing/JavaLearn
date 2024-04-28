package com.itheima.d15_stringBuilder;

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
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length -1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[arr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
