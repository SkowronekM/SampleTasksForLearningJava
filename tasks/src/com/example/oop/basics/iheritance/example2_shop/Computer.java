package com.example.oop.basics.iheritance.example2_shop;

public class Computer extends Product {
    public Mouse mouse;
    public Monitor monitor;
    public Keyboard keyboard;

    Computer() {
        mouse = new Mouse();
        monitor = new Monitor();
        keyboard = new Keyboard();

        price = mouse.price + monitor.price + keyboard.price;
    }

}