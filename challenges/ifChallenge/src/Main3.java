public class Main3 {
    public static void main(String[] args) {

        boolean raining = false;
        boolean haveUmbrella = false;
        int temperature = 4;

        if (temperature > 40 || temperature < -20) {
            System.out.println("Pozostań w domu");
        } else if ((temperature > -10 && temperature < 10) && haveUmbrella == true) {
            System.out.println("Możesz wyjść z domu - parasol i -10 do 10");
        } else if (raining == false && temperature > 12){
            System.out.println("Możesz wyjść z domu");
        } else {
            System.out.println("Zostajesz w domu");
        }

    }
}
