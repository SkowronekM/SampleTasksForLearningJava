public class Main {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Blok finally wywołany");
        }

//        TestException testException = new TestException();
        try {
            throw new TestException();
        } catch (TestException exception) {
            exception.printStackTrace();
        }

    }
}