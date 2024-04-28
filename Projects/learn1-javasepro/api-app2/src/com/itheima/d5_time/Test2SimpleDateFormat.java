package com.itheima.d5_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //1 Date、long类型时间格式
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        //2. 格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.HH.mm.ss--dd---MM");

        String rs = sdf.format(d);
        String rs2 = sdf.format(time);
        System.out.println(rs);
        System.out.println(rs2);

        //目标：解析字符串时间
        String dataStr = "2022-12-03 13:56:04";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf3.parse(dataStr);

        System.out.println(d2);
    }
}
