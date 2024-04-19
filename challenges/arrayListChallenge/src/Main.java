import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");

        String getFirst = names.get(0);
        System.out.println(getFirst);

        names.set(2, "Olek");

        names.add(1, "Karol");
        names.remove(0);

        for (String s: names) {
            System.out.println(s);
        }

    }
}