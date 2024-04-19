package com.example.lambda;

import java.util.function.IntSupplier;

public class MethodReference {

    public void Test(IntSupplier intSupplier) {

        System.out.println(intSupplier.getAsInt());

    }

    public static void main(String[] args) {

        Object obj = new Object();
        IntSupplier intSupplier = obj::hashCode;

        System.out.println(intSupplier.getAsInt());

        MethodReference methodReference = new MethodReference();

        methodReference.Test(intSupplier);

    }
}
