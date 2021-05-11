package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Lambda rocks !！")).start();
        List<String> features = Arrays.asList("Java", "Default Method", "Stream API", "Date and Time API");
        features.forEach(System.out::println);
        //(str) ->str.startsWith("J")
//        String a= "a";
//        filter(features,(str) -> true);
        filter(features,(str) ->str.startsWith("J"));
//        filter(features, (str)->str.endsWith("a"));


        //map 输出
        List<Double> costBeforeTax = Arrays.asList(100.00,200.00,300.10,400.11,500.11);
        costBeforeTax.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);
    }




    public static void filter(List<String> names, Predicate<String> condition){
        for(String name:names){
            if(condition.test(name)){
                System.out.println(name + " ");
            }
        }
    }
}
