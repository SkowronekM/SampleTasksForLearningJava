package com.example.oop.basics;

class PlaneWithStatic {
    static int nextId = 0;

    int id;
    int x, y;

    static int getNextId() {
        return nextId++;
    }

    PlaneWithStatic (){
        id = PlaneWithStatic.nextId;
        nextId++;
    }
}

public class StaticExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public int substract (int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();

        System.out.println("Plane1.nextId: " + plane1.id);
        System.out.println("Plane2.nextId: " + plane2.id);

        System.out.println(StaticExample.add(3, 4));

        StaticExample sExample = new StaticExample();
        System.out.println(sExample.substract(10, 12));

    }
}
