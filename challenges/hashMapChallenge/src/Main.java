import java.util.HashMap;
import java.util.Map;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

}


public class Main {
    public static void main(String[] args) {

        HashMap<String, Animal> map = new HashMap<>();

        String names[] = {"Kot", "Pies", "Koza", "Puma"};

        for(int i = 0; i< names.length; i++) {
            String name = names[i];
            map.put(name, new Animal(name));


        }
        System.out.println(map.get("Puma"));

        System.out.println("Zwierzeta w hashMap: \n");

        for(Map.Entry<String, Animal> entry: map.entrySet()) {
            String key = entry.getKey();
            Animal animal = entry.getValue();

            System.out.println("Key: " + key + " animal " + animal.toString());
        }
    }
}