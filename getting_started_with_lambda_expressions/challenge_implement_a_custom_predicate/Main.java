package com.example;

import java.util.List;
import java.util.ArrayList;

@FunctionalInterface
interface StringPredicate {
    boolean test(String s);
}

public class Main {
    public static void main(String[] args) {
        List<String> products = List.of("Shampoo", "Soap", "Toothbrush", "Sunscreen", "Comb", "Conditioner");

        List<String> startsWithS = filterByPredicate(products, s -> s.startsWith("S"));
        System.out.println("Products starting with S: " + startsWithS);

        List<String> longerThanEight = filterByPredicate(products, s -> s.length() > 8);
        System.out.println("Products with name longer than 8 characters: " + longerThanEight);
    }

    public static List<String> filterByPredicate(List<String> items, StringPredicate predicate) {
        // Write your code here
        //return items.stream().filter(predicate).collect(Collectors.toList());
        List<String> newList = new ArrayList<>();
        for(String item : items){
            if(predicate.test(item)) {
                newList.add(item);
            }
        }
        return newList;
    }
}
