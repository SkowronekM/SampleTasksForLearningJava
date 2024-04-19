import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj swoje imię: ");
        String name = reader.readLine();

        System.out.println("Podaj miejsce zamieszkania: ");
        String city = reader.readLine();

        String info = name + " mieszka w " + city;

        System.out.println(info);

        System.out.println("Liczba znaków w tym stringu to: " + info.length());


    }
}