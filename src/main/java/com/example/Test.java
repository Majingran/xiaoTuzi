package com.example;


//    public static void main(String[] args) {
////        short a = 1;
////        short b = 2;
////        short c = a + b;
////        int a = 1;
////        int b = 2;
////        int c = a + b;
////
////
////        new String();
//    }



//    public class Test {
//
//        int i = 1000;
//        float f = 45.0f;
//        char s = '\u0639';
//        Object o = 'f';
//        String as = "hello,world\0";
//        Double d = 100;
//
//    }
public class Test{
    static class Parent{
        public static int A = 1;
        static {
            A = 2;
        }

        static class Sub extends Parent{
            public static int B = A;

            static {
                System.out.println("zzzzzzzzzzzzzzzzzz");
            }
        }

        public static void main(String[] args) {
            final String a = "bb";

            System.out.println(Sub.B);
        }
    }
}


