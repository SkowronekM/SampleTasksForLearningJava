package com.example.oop.basics.iheritance.final_example;

class Employee {
    String name;
    String surname;
    String jobTitle;
    float salary;
}

class Manager extends Employee {
    String responsibility;
}

class Director extends Manager {
    String department;
}

class VicePresident extends Director {

}

final class CEO extends  VicePresident {
    String companyName;
}

/*
class Something extends CEO {
  // nie można rozszerzyć klasy CEO
}
*/


public class Test {
    public static void main(String[] args) {

        CEO ceo = new CEO();

    }
}
