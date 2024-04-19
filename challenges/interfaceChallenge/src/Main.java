public class Main {
    public static void main(String[] args) {
        Browser browser1 = new Chrome();
        browser1.goToPage("google.com");

        Browser browser2 = new Firefox();
        browser2.goToPage("google.pl");
    }
}