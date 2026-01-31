package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(3200, 4500, 2100, 5000, 3800, 1900);
        int result = processSalaries(salaries);
        System.out.println("Total increased salaries above threshold: " + result);
    }

    public static int processSalaries(List<Integer> salaries) {
        // Write your code here
        return salaries.stream()
            .filter(x -> x>3000)
            .mapToInt(x -> (int) Math.round(x * 1.1))
            .sum();
        
    }
}
