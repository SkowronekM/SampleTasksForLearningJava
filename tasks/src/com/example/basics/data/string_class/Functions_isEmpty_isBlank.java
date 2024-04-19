package com.example.basics.data.string_class;

public class Functions_isEmpty_isBlank {
    public static void main(String[] args) {

        String emptyStr = "";
        String blankStr = "   \n    ";

        System.out.println(emptyStr.isEmpty());
        System.out.println(emptyStr.isBlank());
        System.out.println(blankStr.isEmpty());
        System.out.println(blankStr.isBlank());

    }
}
