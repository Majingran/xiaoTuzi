package com.example;

public class Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Lambda rocks !！")).start();
    }

}
