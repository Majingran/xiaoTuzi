package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test0908 {
    /*
     * @Description: todo
     * @Author: Mr_ma
     * @Date: 2021-9-9 13:51
     * @param null:
     * @return: null
     **/
//    static int x=10;
//    static {x+=5;}
//    public static void main(String[] args) //4
//    {
//        System.out.println("x="+x);
//    }
//    static{x/=3;};

    /*
     * @Description: todo
     * @Author: Mr_ma
     * @Date: 2021-9-9 13:51
     * @param null:
     * @return: null
     **/
//    private static int j = 0;
//
//    private static Boolean methodB(int k) {
//        j += k;
//        return true;
//    }
//
//    public static void methodA(int i) {
//        boolean b;
//        b = i < 10 | methodB(4);
//        b = i < 10 || methodB(8);
//
//    }
//
//    public static void main(String args[]) {
//        List array = new ArrayList(20);
//        methodA(0);
//        System.out.println(j);
//    }
/*
 * @Description: todo
 * @Author: Mr_ma 
 * @Date: 2021-9-9 13:54
 * @param null: 
 * @return: null
 **/

//    public static void main(String args[]) {
//
//        StringBuffer a = new StringBuffer("A");
//
//        StringBuffer b = new StringBuffer("B");
//
//        operate(a, b);
//
//        System.out.println(a +"."+b);
//    }
//
//    static void operate(StringBuffer x, StringBuffer y) {
//        x.append(y);
//        y = x;
//    }
    /**
     * @Description: todo
     * @Author: Mr_ma
     * @Date: 2021-9-9 14:00
     * @param null:
     * @return: null
     **/

    public static void main(String[] args) {
        int a = Integer.parseInt("1024");
        int b = Integer.valueOf("1024").intValue();
        System.out.println(a == b);
    }

}
