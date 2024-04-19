public class Main {
    public static void main(String[] args) {

        int numArr[] = {0, 1, 2, 3, 4, 5};
        int a = 0;

        for ( int num : numArr){
            System.out.println(num);
            a += num;
        }

        System.out.println("Suma: " + a);

    }
}