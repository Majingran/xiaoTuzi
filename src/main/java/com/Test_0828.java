package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//public abstract  class Test_0828 extends ClassLoader{
//    //nums contains Integer objects
//    //nums contains Integer objects
//    public static void main(String[] args) {
//        List<Integer> nums ;
//        Integer [] numArray = {0,0,4,2,5,0,3,0};
//        nums  = Arrays.asList(numArray);
//        List nums_2 = new ArrayList(nums);
//        numQuest(nums_2);
//    }
//
//
//    public static void numQuest(List<Integer> nums) {
//        int k = 0;
//        Integer zero = new Integer(0);
//        while (k < nums.size()) {
//            if (nums.get(k).equals(zero))
//                nums.remove(k);
//            k++;
//        }
//        System.out.println(nums);
//    }
//
//
//
//
//
//
//
//    protected abstract void f1();
//
//    public final void f2(){};
//
//    static final void fq(){};
//}


public class Test_0828 {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//
//            String str = sc.next();
//
//
//            int num = Integer.parseInt(str.substring(0,str.indexOf(" ")));
//
//            String [] strArray = str.split(" ");
//            int sum = 0;
//            for(int i = 1; i < num+1;i++){
//                sum += Integer.parseInt(strArray[i]);
//            }
//            System.out.println(sum);
//        }
//        float x = 1.0;
        boolean b = 3>5;
        double
                first = 1.0;
        String a ;
//        int i;


        Scanner sn = new Scanner(System.in);
        while (sn.hasNext()) {
            String inputS = sn.next();
            String[] inputSList = inputS.split(",");
            Arrays.sort(inputSList);

            for (int i = 0; i < inputSList.length; i++) {
                if (i == inputSList.length - 1) {
                    System.out.println(inputSList[i]);
                    break;
                } else {
                    System.out.print(inputSList[i] + ",");
                }
            }
        }
        sn.close();
    }

}