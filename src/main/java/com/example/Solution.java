package com.example;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
//        if(nums == null && nums.length == 0){
//            return 0;
//        }
//        int j = 0;
//        for (int i = 1;i < nums.length;i++){
//            if(nums[i] != nums[j]){
//                nums[j+1] = nums [i];
//                j++;
//            }
//        }
//        return j+1;
        int j = nums.length;
        if(j > 1){
            j = 1;
            for(int i = 1; i < nums.length; i ++){
                if(nums[i] == nums[i - 1]){
                    continue;
                } else{
                    nums[j] = nums[i];
                    j++;
                }
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,2,2,2,3,3,3};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums) +"," + Arrays.toString(nums));
    }
}