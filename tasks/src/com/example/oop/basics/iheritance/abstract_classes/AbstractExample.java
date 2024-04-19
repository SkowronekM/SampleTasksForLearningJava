package com.example.oop.basics.iheritance.abstract_classes;

public class AbstractExample {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Adam", "Kowalski", 22);
        worker1.printInfo();

        Manager manager = new Manager("Adas", "Olkowski", 33, "takk");
        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName());

    }
}
