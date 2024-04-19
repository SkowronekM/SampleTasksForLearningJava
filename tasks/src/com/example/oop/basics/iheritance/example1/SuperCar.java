package com.example.oop.basics.iheritance.example1;

public class SuperCar extends Car {
    SuperCar(){
        type = "SuperCar";
        topSpeed = 300.0f;
    }

    public void setSportMode() {
        System.out.println("Sport mode activated");
    }
}
