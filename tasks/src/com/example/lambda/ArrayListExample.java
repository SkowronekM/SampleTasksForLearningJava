package com.example.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("bmw");
        arr.add("audi");
        arr.add(null);
        arr.add("citroen");
        arr.add(null);

        arr.removeIf(a -> a == null || a.equalsIgnoreCase("bmw"));

        System.out.println(arr);

    }
}
