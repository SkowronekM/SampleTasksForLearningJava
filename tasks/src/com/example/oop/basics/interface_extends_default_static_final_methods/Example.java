package com.example.oop.basics.interface_extends_default_static_final_methods;

public class Example {
    public static void main(String[] args) {

        Parrot parrot = new Parrot();

        parrot.fly();
        parrot.searchForFood();

        System.out.println(parrot.getWingspan());
        System.out.println("Default number of wings: " + Flying.getDefaultNumWings());

    }
}
