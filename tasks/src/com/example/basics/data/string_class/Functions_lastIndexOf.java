package com.example.basics.data.string_class;

public class Functions_lastIndexOf {
    public static void main(String[] args) {

        String str = "Raz dwa trzy cztery. Raz dwa trzy";

        int index = str.indexOf("dwa");
        System.out.println("Pierwsze wystąpienie słowka dwa zaczyna się od: " + index);

        index = str.lastIndexOf("dwa");
        System.out.println("Ostatnie wystąpienie słówka dwa zaczyna się od: " + index);

        String fragment = str.substring(index);
        System.out.println(fragment);

    }
}
