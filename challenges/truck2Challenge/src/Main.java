class Truck {

    String producent, model, color;
    int wheels;
    final float TOP_SPEED = 100;
    final float ACCELERATION;

    Truck () {
        producent = "Freighliner";
        model = "9664";
        wheels = 4;
        ACCELERATION = 60;
    }
    Truck(String color) {
        this();
        this.color = color;
    }

    public void printInfo () {
        System.out.println("TRUCK: " + this.producent + " " +  this.model + " " +  this.color);
    }
}

public class Main {
    public static void main(String[] args) {

    Truck truck1 = new Truck("red");
    truck1.printInfo();

    }
}