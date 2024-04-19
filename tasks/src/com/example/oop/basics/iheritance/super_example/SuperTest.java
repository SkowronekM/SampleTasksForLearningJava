package com.example.oop.basics.iheritance.super_example;



public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("Ania", "Kowalska", 5);
        Teacher teacher = new Teacher("Adam", "Taki", "math");
        System.out.println(teacher.getTeachingSubject());
        Director director = new Director("Anna", "Zablocka", 1);


    }
}
