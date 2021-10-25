package com.example;

public class Test_0829 {


    long var;
    Test_0829(){};
    public  Test_0829(long param) {
        var = param;
    }//(1)
//    public static void main(String[] args) {
//        MyClass a, b;
//        a =new MyClass();//(2)
//        b =new MyClass(5);//(3)
//    }



    public static void main(String[] args) {
//        Integer i = 42;
//        Long l = 42l;
//        Double d = 42.0;
//        System.out.println((i == l));
//        System.out.println((i == d));
//        System.out.println((l == d));
//        System.out.println(i.equals(d));
//        System.out.println(i.equals(l));
//        System.out.println(l.equals(d));
//        System.out.println(l.equals(42L));

        long c = 123;


        Test_0829 a, b;
        a =new Test_0829();//(2)
        b =new Test_0829(c);//(3)

    }
}
