package com.example.thread;

public class ThreadTest {
    public static void main(String[] args) {
        MyRunable1 mr1 = new MyRunable1();
        MyRunable2 mr2 = new MyRunable2();
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        t1.start();
        t2.start();
    }
}
