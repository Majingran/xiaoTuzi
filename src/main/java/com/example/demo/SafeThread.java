package com.example.demo;

public class SafeThread {

    private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    private int count = 0;

    public void calc() {
        threadLocal.set(count + 1);
    }

    public int getCount() {
        Integer integer = threadLocal.get();
        return integer != null ? integer : 0;
    }

    public static void main(String[] args) throws InterruptedException {
        SafeThread testThreadLocal = new  SafeThread();
        for(int i  = 0; i < 20; i++){
            new ThreadB(i,testThreadLocal).start();
        }
        Thread.sleep(200);

        System.out.println("realCount:" + testThreadLocal.getCount());
    }
}
