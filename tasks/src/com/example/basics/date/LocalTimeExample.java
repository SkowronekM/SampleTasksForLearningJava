package com.example.basics.date;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println(localTime.getHour());

        localTime = localTime.plusHours(2);
        System.out.println("PO ZMIANIE");
        System.out.println(localTime.getHour());
    }
}
