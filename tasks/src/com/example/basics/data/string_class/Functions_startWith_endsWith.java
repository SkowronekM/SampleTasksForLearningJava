package com.example.basics.data.string_class;

public class Functions_startWith_endsWith {
    public static void main(String[] args) {

        String str1 = "Hello World!";

        if (str1.startsWith("HE")) {
            System.out.println("Zaczyna się danym ciągiem");
        } else
            System.out.println("Nie zaczyna się danym ciągiem");

        if (str1.endsWith("ld!")) {
            System.out.println("Zaczyna się danym ciągiem");
        } else
            System.out.println("Nie zaczyna się danym ciągiem");

    }
}
