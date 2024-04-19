import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int number = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String liczba;

        for ( ; ; ) {
            System.out.println("Podaj liczbę lub quit: ");
            liczba = reader.readLine();
            if (liczba.equalsIgnoreCase("quit")) break;
            int num = Integer.parseInt(liczba);
            number += num;

            System.out.println("Number: " + number);
        }




    }
}