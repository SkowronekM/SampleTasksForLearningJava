package com.example.basics.data.string_class;

public class BlankStringAndNull {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.length());

        s1 = s1.concat("Hello World!");

        System.out.println(s1);

        String s2 = null;
//        s2 = "test";
        System.out.println(s2);

    }
}
