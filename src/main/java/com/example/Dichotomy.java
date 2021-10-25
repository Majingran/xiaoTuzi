package com.example;

/**
 * @Description: 二分法
 * @Author: Mr_ma
 * @Date: 2021-9-7 15:55
 * @param null:
 * @return: null
 **/
public class Dichotomy {
    public int dichotomy(int[] nums, int target) {
//        int p;
//        if(nums.length == 1){
//            p = 0;
//        }else{
//            p = nums.length / 2 - 1;
//        }
//        int[] temp = new int[p+1];
//        if (nums[p] < target) {
//            System.arraycopy(nums, p+1, temp,0,p+1);
//            dichotomy(temp,target);
//        } else if (nums[p] > target){
//            System.arraycopy(nums, 0, temp,0,p);
//            dichotomy(temp,target);
//        }else if (nums[p] == target) {
//            return p;
//        }
//        return -1;
        if(nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length -1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target ){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] paramArray = {-1,0,3,5,9};
        Dichotomy dichotomy = new Dichotomy();
        System.out.println(dichotomy.dichotomy(paramArray,9));
    }
}
