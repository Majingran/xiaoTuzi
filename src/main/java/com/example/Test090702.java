package com.example;


import java.io.UnsupportedEncodingException;

public class Test090702 {
    public class test{}
    private int count;

    public static void main(String[] args) throws UnsupportedEncodingException {
//        Test090702 test = new Test090702(88);
//        System.out.println(test.count);

//        40、怎样将 GB2312 编码的字符串转换为 ISO-8859-1 编码的
//        字符串？
        String s1 = "你好a";
        String s2 = new String(s1.getBytes("GB2312"), "ISO-8859-1");
//        String s3 = s1.substring(1) + s1.charAt(0);
        System.out.println(reverse(s1));
    }

    Test090702(int a) {
        count = a;
    }


    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
}
class test2{}
class test3{}
