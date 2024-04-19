import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj numer miesiąca od 1 do 12: ");
        int month = Integer.parseInt(reader.readLine());

        switch (month){
            case 1:
                System.out.println("Zima");
                break;
            case 3:
                System.out.println("Wiosna");
                break;
            case 6:
                System.out.println("Lato");
                break;
            case 9:
                System.out.println("Jesień");
                break;
            default:
                System.out.println("Zły miesiąc");
        }

    }
}