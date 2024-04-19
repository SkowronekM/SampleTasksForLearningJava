public class Main4 {
    public static void main(String[] args) {

        int points = 0;
        boolean driverLicense = true;
        int experienceYears = 12;
        boolean drunkDriving = false;
        boolean causedAccident = false;
        boolean overSpeeding = true;

        if (driverLicense == true){
            points += 20;
        }
        if (drunkDriving == true || causedAccident == true) {
            points -= 100;
        }
        if (overSpeeding == true) {
            points -= 10;
        }
        if (experienceYears >= 10) {
            points += 20;
        }
        if (experienceYears > 60) {
            points -=20;
        }

        System.out.println("Kierowca ma " + points + " punktów.");
    }
}
