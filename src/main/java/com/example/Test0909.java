package com.example;

//    private static final long serialVersionUID = 1L;
//
//    private void test() {
//        System.out.println(super.getClass().getName());
//    }
//
//    public static void main(String[] args) {
//        new Test0909().test();
//        Map<String,Object> map = new HashMap<>();
//        map.put("","");
//    }

/**
 * @Description: todo
 * @Author: Mr_ma
 * @Date: 2021-9-9 14:35
 * @param null:
 * @return: null
 **/

public class Test0909 {
    int w, x, y, z;

    public Test0909(int a, int b) {
        x = a;
        y = b;
    }

    public Test0909(int a, int b, int c, int d) {
//        Test0909(a, b);
//        x=a,y=b;
//        x = a;y = b;
        this(a,b);
        w = d;
        z = c;
    }

}

/**
 * @Description: todo
 * @Author: Mr_ma
 * @Date: 2021-9-9 14:35
 * @param null:
 * @return: null
 **/
//
//public interface Test0909{
//    static add();
//}




