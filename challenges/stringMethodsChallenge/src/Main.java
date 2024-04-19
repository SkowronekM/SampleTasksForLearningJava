public class Main {
    public static void main(String[] args) {

        String text = "Ola ma kota. ";
        text = text.repeat(3);
        System.out.println("Trzykrotny tekst: " + text);

        text = text.replaceAll("Ola", "Kasia");
        System.out.println("Zamiana Ola na Kasia: " + text);

        text = text.replaceFirst("Kasia", "Monika");
        System.out.println("Zamiana pierwszego Kasia na Monika: " + text);

        System.out.println("\nTekst: " + text);
        int index = text.indexOf("Kasia");
        System.out.println("Pierwsze wystapienie Kasia: " + index);

        index = text.lastIndexOf("Kasia");
        System.out.println("Ostatnie wystapienie Kasia: " + index);

        System.out.println("\nTekst: " + text);
        index = text.indexOf("Kasia");
        text = text.substring(index);
        System.out.println("Wyswietlenie tekstu od pierwszego wystapienia Kasia: " + text);


    }
}