import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String names[] = {"Ania", "Ola", "Daniel", "Karol", "Kasia"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj indeks który chcesz wyświetlić od 0 do 4: ");
        String indeks = reader.readLine();

        int value = Integer.parseInt(indeks);

        System.out.println("Twój wybrany indeks to: " + indeks);

        System.out.println("Wartość pod indeksem " + indeks + " to: " + names[value]);


    }
}