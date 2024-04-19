import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

        LinkedList<Animal> animals = new LinkedList<>();

        for(int i = 0; i < 20; i++ ) {
            String arr[] = {"Dog", "Cat", "Tiger", "Lion", "Panda"};

            String random = arr[(int) Math.floor(Math.random()*arr.length)];
            animals.add(new Animal(random));
        }

        animals.removeFirst();
        animals.removeLast();

        animals.addFirst(new Animal("tiger"));
        animals.addLast(new Animal("lion"));

        ListIterator<Animal> iterator = animals.listIterator();

        while(iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal);
        }

    }
}