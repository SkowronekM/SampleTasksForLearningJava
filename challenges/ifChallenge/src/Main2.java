public class Main2 {
    public static void main(String[] args) {

        int age = 17;
        int weight = 49;

        if (age >= 18){
            if (weight >= 50) {
                System.out.println("Możesz oddać krew ponieważ masz " + age + " lat i " + weight + " kg.");
            } else {
                System.out.println("Nie możesz oddać krwi ponieważ nie masz minimum 50kg");
            }
        } else {
            System.out.println("Nie możesz oddac krwi ponieważ nie masz minimum 18 lat.");
        }

    }
}
