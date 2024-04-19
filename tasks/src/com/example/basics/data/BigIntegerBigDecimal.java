package com.example.basics.data;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger("2362674584583251232");
        bigInt = bigInt.add(new BigInteger("8961259182047124"));
        System.out.println("Wynik to: " + bigInt);

        BigDecimal decimal = new BigDecimal("8961294612.1241289046");
        decimal = decimal.pow(3);
        decimal = decimal.subtract(new BigDecimal("24152.512512"));
        System.out.println("Wynik to: " + decimal);

    }
}
