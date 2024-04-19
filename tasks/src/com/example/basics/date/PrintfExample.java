package com.example.basics.date;

import java.util.Date;

public class PrintfExample {
    public static void main(String[] args) {

        System.out.printf("Hello %s %d %f %b %n %tc" , "World!", 100, 12.5f, true, new Date());

        System.out.printf("%n%n Hello %s %2$tY dzień: %2$td miesiąc %2$tm", "World", new Date());

        String str = String.format("%n%n %1$tT", new Date());
        System.out.println(str);

        str = String.format("%n %1$tH - %1$tM - %1$tS", new Date());
        System.out.println(str);

    }
}
