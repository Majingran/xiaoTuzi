package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test0904 extends Test_0903
{
    private int a=10;
    int b=20;
    static int c=1;
     void add2(){

    }
    static void add(){
//        add2();
        Test0904 test0904 = new Test0904();
        test0904.add2();

    }

    private class test{}
    public class test1{}
    protected class test2{}
    class test3{}


    public static void main(String arg[])
    {
        Set set = new HashSet();
        set.add("");
        set.add("");
        System.out.println(set);
        List list = new ArrayList();
        list.add("");
        list.add("");
        System.out.println(list);

        Test0904 t = new Test0904();
        t.a = 10;
        String s = "祝你考出好成绩";
        System.out.println(s.length());

//        t.c
    }
}
