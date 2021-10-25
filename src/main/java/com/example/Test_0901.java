package com.example;

import java.util.HashMap;

public class Test_0901 extends Thread {
//        public void run() {
//            System.out.println("In run");
//            yield();
//            System.out.println("Leaving run");
//        }
//
//        public static void main(String[] argv) {
//
//            HashMap<String,Object> map = new HashMap<>();
//            map.put(null,null);
//
//            (new Test_0901()).start();
//        }
    private String name = "abc";

    public static void main(String[] args) {
//        short s1 = 1;
//        Test_0901 test = new Test_0901();
//        Test_0901 testB = new Test_0901();
//        String result = test.equals(testB) + ",";  //false
//        result += test.name.equals(testB.name) + ",";//true
//        result += test.name == testB.name;//true
//        System.out.println(result);
        String s1 = new StringBuilder("go")
                .append("od").toString();
        System.out.println(s1.intern() == s1);


        String s2 = new StringBuilder("ja")
                .append("v").toString();
        System.out.println(s2.intern() == s2);
    }
    }
