package com.example.basics.data.string_class;

public class Functions_replaceAll_replaceFirst {
    public static void main(String[] args) {

        String str = "Ola ma kota. Dodatkowo Ola ma psa.";
        String str1 = str.replaceAll("ma", "posiada");

        System.out.println("Przed: " + str);
        System.out.println("Po: " + str1);

        String str2 = str.replaceFirst(" ", "   ");
        System.out.println(str2);

    }
}
