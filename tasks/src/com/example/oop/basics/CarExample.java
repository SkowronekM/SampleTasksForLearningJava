package com.example.oop.basics;

class Car {

    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    public Car(String manufacturer, String name, int year, String color, float topSpeed){
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public Car(){
        this.manufacturer = "unknown";
    }

    public void printInfo(){
        System.out.println(this.manufacturer + " " + this.name + ", rok: " + this.year + ", kolor: " +
                this.color + ", max_speed: " + this.topSpeed);
    }
}

public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 230.0f;
        ford.printInfo();

        Car chevrolet = new Car();
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "yellow";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.0f;
        chevrolet.printInfo();

        Car dodge = new Car("Dodge", "Viper", 1997, "red", 280.0f);
        dodge.printInfo();
    }
}
