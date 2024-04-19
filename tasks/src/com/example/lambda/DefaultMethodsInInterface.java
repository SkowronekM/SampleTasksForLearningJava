package com.example.lambda;

@FunctionalInterface
interface MathInterface {
    int operate (int a, int b);

    default int add (int a, int b) {
        return a + b;
    }

    default int subtract (int a, int b) {
        return a - b;
    }

    default int multiply(int a, int b) {
        return a * b;
    }

    static int divide (int a, int b) {
        return a / b;
    }
}

class MathClass implements MathInterface {
    @Override
    public int multiply(int a, int b) {
        System.out.println("MathClass.multiply()");
        return a * b;
    }

    @Override
    public int operate(int a, int b) {
        System.out.println("MathClass.operate()");
        return a+b;
    }
}

public class DefaultMethodsInInterface {
    public static void main(String[] args) {

        MathInterface math = (int a, int b) -> a*b;

        System.out.println(math.operate(10, 30)); // 300
        System.out.println(MathInterface.divide(100, 4)); // 25

        System.out.println(math.add(10, 15)); // 25
        System.out.println(math.multiply(10, 3)); // 30

        MathClass mathClass = new MathClass();

        System.out.println(mathClass.operate(10, 10)); // 20
        System.out.println(mathClass.multiply(3, 3)); // 9
        System.out.println(mathClass.subtract(10, 4)); // 6

    }
}
