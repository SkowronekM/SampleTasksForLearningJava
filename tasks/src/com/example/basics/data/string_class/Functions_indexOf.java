package com.example.basics.data.string_class;

public class Functions_indexOf {
    public static void main(String[] args) {

        String str = "Raz dwa trzy cztery";

        int index = str.indexOf("dwa");

        System.out.println(index);

        System.out.println(str.substring(index));

        index = str.indexOf(5);
        System.out.println(index);

        index = str.indexOf("trzy", 9);  // -1 bo zaczyna się od 8 już
        System.out.println(index);


    }
}
