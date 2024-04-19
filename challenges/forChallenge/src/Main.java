public class Main {
    public static void main(String[] args) {

        String names[] = {"Ania", "Kasia", "Ola", "Olek", "Daniel"};

        System.out.println("Od początku: ");

        for (int i = 0; i < names.length; i++){
            System.out.println("Imię: " + names[i]);
        }

        System.out.println("Od końca: ");

        for (int i = names.length - 1; i >= 0; i--){
            System.out.println("Imię: " + names[i]);
        }

    }
}