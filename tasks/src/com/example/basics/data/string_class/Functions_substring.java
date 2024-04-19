package com.example.basics.data.string_class;

public class Functions_substring {
    public static void main(String[] args) {

        String str = "Ola ma psa oraz kota";

        String frag1 = str.substring(4);
        System.out.println(frag1);

        String frag2 = str.substring(4, 6);
        System.out.println(frag2);

    }
}
