package com.example;



/**
 * @Description:
 *初始条件：left = 0, right = length-1
 * 终止：left > right
 * 向左查找：right = mid-1
 * 向右查找：left = mid+1
 * @Author: Mr_ma
 * @Date: 2021-9-7 20:22
 **/
public class MySqrt {
    public int mySqrt(int x){
        if(x < 2){
            return x;
        }
        int left = 1,right = x;
        while (left <= right){
            int mid = left + (right-left)/2;
            if(x/mid > mid){
                left = mid + 1;
            }else if(x/mid < mid){
                right = mid - 1;
            }else if(x/mid == mid){
                return mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        System.out.println(mySqrt.mySqrt(8));
    }
}
