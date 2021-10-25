package com.example.utils;

public class NewCode_0902 {

    int d = 10;

    //冰升温
    public int bingToZero(int param,int C){
        return -param * C;
    }

    //水升温
    public int WaterUp(int param,int E){
        return param * E;
    }

    public static void main(String[] args) {
        int sumTime = 0;
        NewCode_0902 newCode_0902 = new NewCode_0902();
//        if(){
//            sumTime = newCode_0902.bingToZero(-10,5) + newCode_0902.WaterUp(20,3) + 10;
//        }else {
        sumTime =  newCode_0902.WaterUp(92,11) - newCode_0902.WaterUp(35,11);
//        }

        System.out.println(sumTime);
    }







}
