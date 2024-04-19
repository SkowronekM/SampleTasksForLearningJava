package com.example.lambda;

// interfejs funkcyjny
interface Addition {
    int add(int a, int b);
}

// interfejs funkcyjny
interface MathOperation <T> {
    T operate (T a, T b);
}
public class LambdaBasics {

    public void test(Addition addition) {
        System.out.println(addition.add(100, 50));
    }

    public static void main(String[] args) {

        Addition addition = (int a, int b) -> a + b;

        int result = addition.add(2, 5);
        System.out.println(result); // 7

        LambdaBasics lambdaBasics = new LambdaBasics();
        lambdaBasics.test( (a, b) -> a*2+b ); // 250

        MathOperation<Float> addition2 = (a,b) -> a+b;
        System.out.println(addition2.operate(10.0f, 6.0f)); // 16

        MathOperation<Integer> substraction = (a,b) -> a-b;
        System.out.println(substraction.operate(10, 2)); // 8

    }
}
