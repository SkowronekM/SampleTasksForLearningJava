import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Flat homes[] = new Flat[10];

        for(int i = 0; i < homes.length; i++) {
            int randNumber = (int)Math.floor(Math.random() * 3);
            switch (randNumber) {
                case 0:
                    homes[i] = new Flat();
                    break;
                case 1:
                    homes[i] = new House("Kraków", "Słoneczna", 10);
                    break;
                case 2:
                    homes[i] = new Residence("Warszawa", "Deszczowa", 20, 3);
                    break;
            }
        }

        for(int i = 0; i < homes.length; i++) {

            Flat home = homes[i];

            if(home instanceof Residence) {
                Residence residence = (Residence) home;
                System.out.println("Residence garageSize: " + residence.getGarageSize());
                System.out.println(residence.toString());
            } else if(home instanceof House) {
                House house = (House) home;
                System.out.println("House parcelSize: " + house.getParcelSize());
                System.out.println(house.toString());
            } else {
                System.out.println(home.toString());
            }
        }
    }
}