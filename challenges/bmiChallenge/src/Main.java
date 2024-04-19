public class Main {
    public static void main(String[] args) {

        double weight = 70d;
        float height = 1.75f;

        float bmi = (float) (weight / Math.pow(height, 2));
        System.out.println(bmi);

        int bmiInt = (int) bmi;

        System.out.println(bmiInt);

    }
}