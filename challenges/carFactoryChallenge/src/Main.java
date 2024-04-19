class Car {

    String model;
    String brand;
    String color;

    Car (String model, String brand, String color){
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void printInfo(){
        System.out.println("Information about car: " + this.model + " " + this.brand + " " + this.color);
    }
}

class CarFactory {

    CarFactory() {
    }
    public Car buildCar (){

        String colors[] = {"black", "white", "red"};
        int randIndex = (int) Math.floor(Math.random() * colors.length);
        String randColor = colors[randIndex];

        return new Car("Ford", "Mustang", randColor);


    }


}

public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.buildCar();
        car1.printInfo();
        System.out.println("Car1 color: " + car1.getColor());

        Car car2 = carFactory.buildCar();
        car2.printInfo();
        System.out.println("Car2 color: " + car2.getColor());

    }
}