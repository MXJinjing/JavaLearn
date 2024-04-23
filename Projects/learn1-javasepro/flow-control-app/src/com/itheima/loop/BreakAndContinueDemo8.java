package com.itheima.loop;

public class BreakAndContinueDemo8 {
    public static void main(String[] args) {

        //1. break
        for (int i = 1; i <= 5; i++) {
            System.out.println("我爱你" + i);
            if (i == 3) //说了三次退出
                break;
        }

        //2. continue
        for (int i = 1; i <= 5; i++) {
            if(i == 3)  //到了第三天不用洗
                continue;
            System.out.println("洗碗" + i);
        }
    }
}
