package com.example.basics.data.types;

public class J10_arrays {
    public static void main(String[] args) {

        int numArr[] = new int[10];
        System.out.println("Drugi element to: " + numArr[1]);

        numArr[1] = 7;

        System.out.println("Drugi element to: " + numArr[1]);
        System.out.println("Długość to: " + numArr.length);

        float floatsArr[] = {10.1f, 123.78f, 22.222f};

//        floatsArr[0] = 1.0f;

        System.out.println("Tablica floats[1] to: " + floatsArr[1]);
        System.out.println("Długość tablicy floats to: " + floatsArr.length);

        String strArr[] = new String[7];
        System.out.println("strArr[1]: " + strArr[1]);

        String namesArr[] = {"Ola", "Patrycja", "Zbyszek"};
        System.out.println("namesArr[1]: " + namesArr[1]);
    }
}
