package com.example;

public class Test090801 {
    private String baseName = "base";

    public Test090801() {
        callName();
    }

    public void callName() {
        System.out.println(baseName);
    }

    static class Sub extends Test090801 {
        private String baseName = "sub";

        public void callName() {
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        Test090801 b = new Sub();
    }



//    public static void main(String[] args) {
//        Test090801 inc = new Test090801();
//        int i = 0;
//        inc.fermin(i);
//        i= i ++;
//        System.out.println(i);
//
//    }
//    void fermin(int i){
//        i++;
//    }
}
