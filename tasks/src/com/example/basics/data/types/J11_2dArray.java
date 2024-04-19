package com.example.basics.data.types;

public class J11_2dArray {

    public static void main(String[] args) {

        String strArr[][] = { // [2][3]
                {"1", "2", "3"},
                {"4", "5", "6"}
        };

        System.out.println(strArr[1][0]);

        int numArr[][] = new int [3][4];
        numArr[1][2] = 100;

        System.out.println(numArr[1][2]);
    }
}
