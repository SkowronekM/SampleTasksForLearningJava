public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Romet", "2000");
        bike.printInfo();

        MotorBike motorBike = new MotorBike("yamaha", "kozacka");
        motorBike.printInfo();
    }
}