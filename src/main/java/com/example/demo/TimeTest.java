package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @param :
 * @Description: Java 1.8 日期练习类
 * @Author: Mr_ma
 * @Date: 2021-1-3 21:13
 * @return: null
 **/

public class TimeTest {
//    String time = "1997-01-31 18:39:20";
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//    LocalDateTime dateTime =LocalDateTime.from(formatter.parse(time));
//    String time = "1997-01-31 18:39:20";
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//    LocalDateTime dateTime = LocalDateTime.parse(time,formatter);

    public static void main(String[] args) {
        String time = "202101032113";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        LocalDateTime dateTime = LocalDateTime.from(formatter.parse(time));
        System.out.println("比较时间：" + dateTime);
        LocalDateTime nowtime = LocalDateTime.now();
        System.out.println("当前时间：" + nowtime);
        System.out.println("当前时间" + (nowtime.compareTo(dateTime) > 0 ? "大于" : "小于") + "比较时间");
    }
}

