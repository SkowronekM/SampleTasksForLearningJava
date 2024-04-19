package com.example.basics.data.string_class;

public class Functions_repeat_join_concat {
    public static void main(String[] args) {

        String str = "Informacja";
        str = str.repeat(4);
        System.out.println(str);

        String joinedText = String.join(" X ", "raz", "dwa", "trzy");
        System.out.println(joinedText);

        String text = "Ola ".concat("ma ").concat("kota") + " xd";
        System.out.println(text);

    }
}
