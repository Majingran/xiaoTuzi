package com.example;

public class Test_0903 extends Thread{


    static void add4(){

    }
    public void run() {
        try {

            Thread.sleep(10000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        System.out.print("run");

    }

    private static int i = 1;
    static void add (){
        i = 2;
    }

    public static void main(String[] args) {
        Test_0903 example = new Test_0903();

        example.run();

        System.out.print("main");

    }
}
