package com.example;

public class NewCode_090201 {
    public static void main(String[] args) {
        int l = 1, r = 5, a = 2;
        int n = 0;
        for (int i = 0; i <= r; i++) {
            int flag = (r - l) % a;
            if (flag == 0) {
                n++;
            }
            --r;
        }
        System.out.println(n);


    }
}
