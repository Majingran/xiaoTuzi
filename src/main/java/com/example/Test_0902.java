package com.example;

import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_0902 {
//    public static void main(String[] args) {
//        Integer numArray[] = {5,3,1};
//        List<Integer> nums ;
//        nums = new ArrayList(Arrays.asList(numArray));
//        nums.add(6);
//        nums.add(0,4);
//        nums.remove(1);
//        System.out.println(nums);
        public static void main(String[] args) {
            Object o = new Object() {
                public boolean equals(Object obj) {
                    return true;
                }
            };
            System.out.println(o.equals("Fred"));
        }

    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }else if( n == 1){
            return 1;
        }
        if(n > 1){
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
        return 0;
    }
}
