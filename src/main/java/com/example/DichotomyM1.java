package com.example;

public class DichotomyM1 {
    public int dichotomyM1(int num ){
        int left = 1;
        int right = num;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
                // 1false 2true 3true  4true 5true


                //1 false 2 false 3false 4false 5true
            } else if (!isBadVersion(mid)) {
                left = mid + 1;
            }
        }
        return left;
    }

    boolean isBadVersion(int n) {
        if (n >= 999) {
            System.out.println(n+"true");
            return true;
        }
        System.out.println(n+"false");
        return false;
    }

    public static void main(String[] args) {
        DichotomyM1 dichotomyM1 = new DichotomyM1();
        System.out.println(dichotomyM1.dichotomyM1(1000));
    }

}
