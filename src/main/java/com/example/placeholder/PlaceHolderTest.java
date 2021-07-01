package com.example.placeholder;

import java.text.MessageFormat;

public class PlaceHolderTest {
    public static void main(String[] args) {
        String url = "我是%s";
        String name = "马靖然";
        url = String.format(url,name);
        System.out.println(url);
        String url2 = "我是{0}";
        String name2 = "孙莹莹";
        url2 = MessageFormat.format(url2,name2);
        System.out.println(url2);
    }
}
