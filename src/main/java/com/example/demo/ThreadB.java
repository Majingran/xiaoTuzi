package com.example.demo;


public class ThreadB extends Thread {

    private int i;
    private SafeThread safeThread;

    ThreadB(int i, SafeThread safeThread) {
        this.i = i;
        this.safeThread = safeThread;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        safeThread.calc();

        System.out.println("i:" + i + ",count:" + safeThread.getCount());
    }

}

