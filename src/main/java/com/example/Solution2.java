package com.example;

public class Solution2 {



    public int maxProfit(int[] prices) {
        if(prices != null && prices.length > 0){
            int total = 0;
            for(int i = 0;i < prices.length-1;i++ ){
                total += Math.max(prices[i+1] - prices[i],0);
            }
            return total;
        }else {
            return 0;
        }

    }


    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
//        int price[] = { 1,5,7,9,12,1};
//        int price[] = { 7,1,5,3,6,4};
//        int price[] = { 1,2,3,4,5};
        int price[] = { 7,6,4,3,1};
        int resultInt = solution2.maxProfit(price);
        System.out.println(resultInt);
    }


}
