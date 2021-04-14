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
    }




    public static void filter(List<String> names, Predicate<String> condition){
        for(String name:names){
            if(condition.test(name)){
                System.out.println(name + " ");
            }
        }
    }
}
