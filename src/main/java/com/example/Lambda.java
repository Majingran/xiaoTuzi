package com.example;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Lambda rocks !！")).start();
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(System.out::println);
    }
}
