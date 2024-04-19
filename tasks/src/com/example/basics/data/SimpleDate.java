package com.example.basics.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.YYYY");
        System.out.println(dateFormat.format(date));

    }
}
