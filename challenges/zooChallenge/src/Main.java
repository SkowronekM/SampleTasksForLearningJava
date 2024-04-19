public class Main {
    public static void main(String[] args) {

        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(new Tiger("Tiger #1", 5));
        zoo.addAnimal(new Lion("Lion #1", 10));
        zoo.addAnimal(new Tiger("Tiger #2", 7));

        zoo.printAllAnimals();

    }
}