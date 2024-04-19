package com.example.basics.date;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());

        System.out.println(localDate.plusYears(2));

    }
}
