package com.example;

import io.swagger.models.auth.In;

public class Test090303 {
    public void add(Integer i){
        i = new Integer(100);
    }



    public static void main(String[] args){
        Integer i = new Integer(50);
        Test090303 test090303 = new Test090303();
        test090303.add(i);
        System.out.println(i);
    }
//    private int getNum(){}
//    boolean setFlag(Boolean [] test);
//    public float get(int x);
//    public static void main(String[] args) {
//        byte b1=1,b2=2,b3,b6,b8;
//        final byte b4=4,b5=6,b7;
//        b3=(b1+b2);  /*语句1*/
//        b6=b4+b5;    /*语句2*/
//        b8=(b1+b4);  /*语句3*/
//        b7=(b2+b5);  /*语句4*/
//        System.out.println(b3+b6);
//    }

}
