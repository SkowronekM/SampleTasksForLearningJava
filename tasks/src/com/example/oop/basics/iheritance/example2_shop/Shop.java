package com.example.oop.basics.iheritance.example2_shop;

import java.security.Key;

public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        Mouse mouse = new Mouse();
        VerticalMouse verticalMouse = new VerticalMouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer();

        System.out.println(computer.monitor.resolution);
        System.out.println("Computer price: " + computer.price);
        System.out.println("Keyboard price: " + keyboard.price);
    }
}
