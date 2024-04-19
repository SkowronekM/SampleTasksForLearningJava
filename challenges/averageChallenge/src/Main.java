public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        double sum = a+b+c+d;

        System.out.println(sum);

        double avg = sum / 4;

        System.out.println(avg);
        avg++;

        System.out.println("Po ++: " + avg);

        avg--;

        System.out.println("Po --: " + avg);




    }
}