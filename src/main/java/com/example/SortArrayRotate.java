package com.example;

public class SortArrayRotate {
    public int search(int[] nums,int target){
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            } else {
                return -1;
            }
        }
        int rotetaPoint = searchRotatePoint(nums);
        if (rotetaPoint == -1){
            rotetaPoint = 0;
        }
        if(nums[rotetaPoint] > target){
            return -1;
        }
        int flag = dichoto(rotetaPoint,nums.length - 1,nums,target);
        if(flag < 0){
            return  dichoto(0,rotetaPoint,nums,target);
        }
        return flag;
    }

    public int dichoto(int left,int right,int nums[],int target){
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid -1;
            }else if(nums[mid] < target){
                left = mid +1;
            }
        }
        return -1;
    }

    //查找旋转点坐标
    public int searchRotatePoint(int[] nums){
        int left = 0;
        int right = nums.length-1;
        if(nums[left] < nums[right]){
            return -1;
        }
        while(left <= right){
            if(nums[left] <= nums[right]){
                return left;
            }
            ++left;
        }
        return -1;
    }

    public static void main(String[] args) {
        SortArrayRotate sortArrayRotate = new SortArrayRotate();
        int nums[] = {3,1};
        System.out.println(sortArrayRotate.search(nums,1));
    }


}
