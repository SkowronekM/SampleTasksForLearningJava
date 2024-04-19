class Roadster {

    float topSpeed, acceleration, crazyTopSpeed, crazyAcceleration;
    boolean crazymode;

    Roadster (float topSpeed, float acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    Roadster (float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
        this.crazymode = true;
    }

    public float getTopSpeed () {
        return topSpeed;
    }

    public float getTopSpeed (boolean crazymode) {
        if (crazymode == true){
            return crazyTopSpeed;
        } else
            return topSpeed;
    }

    public float getAcceleration () {
        return acceleration;
    }

    public float getAcceleration (boolean crazymode) {
        if (crazymode == true){
            return crazyAcceleration;
        } else
            return acceleration;
    }
}

public class Main {
    public static void main(String[] args) {

        Roadster car1 = new Roadster(250.0f, 4.0f);
        System.out.println("Car1 topSpeed: " + car1.getTopSpeed());

        Roadster car2 = new Roadster(250.0f, 4.0f, 300.0f, 1.9f);
        System.out.println("Car2 crazyTopSpeed: " + car2.getTopSpeed(true));

    }
}