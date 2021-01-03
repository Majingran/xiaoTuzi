package com.example.demo;

public class ThreadA extends Thread{

    private int i;
    private UnsafeThread unsafeThread;

    ThreadA(int i, UnsafeThread unsafeThread){
        this.i = i;
        this.unsafeThread = unsafeThread;
    }

    @Override
    public void run(){
        try{
            Thread.sleep(10);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        unsafeThread.calc();

        System.out.println("i:" + i + ",count:" + unsafeThread.getCount());
    }

}
