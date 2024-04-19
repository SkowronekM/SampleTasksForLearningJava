package com.example.basics.data.string_class;

public class Functions_lenght_toLowerCase_toUpperCase_charAt {
    public static void main(String[] args) {

        String str = "Ola ma kota";
        System.out.println("Długość to: "+ str.length());

        char sign = str.charAt(1);
        System.out.println("Znak pod indexem 1: " + sign);

        String strUp = str.toUpperCase();
        System.out.println("Wielkie litery: " + strUp);

        String strDown = str.toLowerCase();
        System.out.println("Małe litery: " + strDown);


    }
}
