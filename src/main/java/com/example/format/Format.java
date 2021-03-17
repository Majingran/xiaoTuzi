package com.example.format;

import java.text.DecimalFormat;

/**
 * @Description: DecimalFormat 数字化变量
 * @Author: Mr_ma
 * @Date: 2021-3-17 0:10
 * @param :
 * @return: null
 **/
public class Format {
    public static void main(String[] args) {
        double pi = 3.1415926;
        System.out.println(new DecimalFormat("0").format(pi));
        System.out.println(new DecimalFormat("00.000000000000").format(pi));
        System.out.println(new DecimalFormat("#.##%").format(pi));


        long c = 299792458;//光速
        System.out.println(new DecimalFormat("#.####E0").format(c));
        System.out.println(new DecimalFormat(",###").format(c));
        System.out.println(new DecimalFormat("光速大小为每秒,###米").format(c));
    }
}
