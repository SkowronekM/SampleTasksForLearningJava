import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        long timestamp = date.getTime(); // 1000 milisekund = 1 sekunda
        System.out.println(timestamp);

        long oneHour = 60*1000*60;
        timestamp += oneHour * 24 * 3; // + 3 dni
        timestamp += oneHour * 10; // + 10h
        timestamp += 1000*60*25; // + 25 minut

        Date futureDate = new Date(timestamp);
        System.out.println(futureDate);
    }
}