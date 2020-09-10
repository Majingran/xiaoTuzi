package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {



    public static void main(String[] args) {
        Map<String,Object> map1 = new HashMap<>();

        map1.put("name","Majingran");
        map1.put("age","26");


        Map<String,Object> map2 = new HashMap<>();
        map2 = map1;
        map2.remove("age");

        List<Map<String,Object>> list = new ArrayList<>();
        list.add(0,map2);
        list.add(1,map1);


        List<Map<String,Object>>list2 = new ArrayList<>();

        list2.addAll(list);

        System.out.println("list2"+list2);

        System.out.println(map2);


    }

}
