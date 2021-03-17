package com.example.test;

public class MyThread {
    public static void main(String[] args) {
        MyRunnableTest mr = new MyRunnableTest();
        MyRunnable2Test mr2 = new MyRunnable2Test();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr2);
        //线程优先级
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
