package com.example.basics.date;

import java.util.Calendar;
import java.util.Date;

public class DateInFutureAndPast {
    public static void main(String[] args) {

        Date dateNow = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(dateNow);
        calendar.add(Calendar.MONTH, 2);
        calendar.add(Calendar.YEAR, 1);
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.HOUR, 1);

        Date dateInFuture = calendar.getTime();
        System.out.println(dateInFuture);

        Date date = new Date();
    }
}
