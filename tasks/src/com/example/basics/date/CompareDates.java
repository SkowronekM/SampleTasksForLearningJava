package com.example.basics.date;

import java.time.LocalDate;

public class CompareDates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2022, 12, 12);
        LocalDate date2 = LocalDate.now();

        if(date1.isAfter(date2)) {
            System.out.println("false");
        } else System.out.println("true");

        if(date2.isEqual(date1)) {
            System.out.println("false");
        } else System.out.println("true ");
    }
}
