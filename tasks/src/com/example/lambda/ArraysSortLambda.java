package com.example.lambda;

import java.util.Arrays;


public class ArraysSortLambda {
    public static void main(String[] args) {

        String arrStr[] = {"Ford", "BMW", "AUDI", "TOYOTA", "MERCEDES"};

        Arrays.sort(arrStr, (a, b) -> a.length() - b.length());

        for(String s : arrStr) {
            System.out.println(s);
        }

    }
}
