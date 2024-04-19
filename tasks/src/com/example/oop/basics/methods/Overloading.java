package com.example.oop.basics.methods;

class RectangleOverloading {

    float side1, side2;
    RectangleOverloading () {
        this(10.0f);
    }

    RectangleOverloading (float v) {
        side1 = side2 = v;
    }

    RectangleOverloading (float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

}

class MathOverloading {

    public int add (int a, int b, int c) {
        return a + b + c;
    }

    public int add (int a, int b) {
        return a + b;
    }

    public float add (float a, float b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {

        MathOverloading math = new MathOverloading();

        int a = 12;
        int b = 3;
        int c = 10;

        System.out.println(math.add(a, b));

        float f1 = 10.0f;
        float f2 = 12.0f;

        System.out.println(math.add(f1, f2));

        System.out.println(math.add(a, b, c));

        RectangleOverloading rect = new RectangleOverloading();
        System.out.println("rect.side1: " + rect.side1);

        RectangleOverloading rect2 = new RectangleOverloading(15.0f);
        System.out.println("rect2.side1: " + rect2.side1);

    }
}
