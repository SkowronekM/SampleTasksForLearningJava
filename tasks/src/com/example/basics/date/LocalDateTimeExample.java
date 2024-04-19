package com.example.basics.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY-MM-dd \t HH:mm:ss");
        String str = dateTimeFormatter.format(localDateTime);
        System.out.println(str);

        System.out.println(localDateTime.getYear());


    }
}
