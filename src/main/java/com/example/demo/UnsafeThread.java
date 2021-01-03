package com.example.demo;

public class UnsafeThread {
    private int count = 0;

    public void calc(){
        count ++;
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) throws InterruptedException{
        UnsafeThread testThread = new UnsafeThread();
        for(int i = 0; i < 20 ;i++){
            new ThreadA(i,testThread).start();
        }

        Thread.sleep(20);
        System.out.println("realCount:" + testThread.getCount());
    }
}
