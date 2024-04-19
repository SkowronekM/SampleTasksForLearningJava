package com.example.oop.basics.exceptions;

public class ExceptionsBasics {
    public static void main(String[] args) {

        try {
            int numArr[] = {0, 1, 2, 3, 4, 5};
            int a = numArr[12];
            int b = numArr[2];
            int result = b / numArr[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e2) {
            e2.printStackTrace();
        } finally {
            System.out.println("Koniec");
        }

        System.out.println("Program continues");

    }
}
