public class Main {
    public static void main(String[] args) {

        String arr[] = {"Ola", "Patrycja", "Jasiek", "Dawid"};
        String text = "";

        for (int i = 0; i < arr.length; i++) {
            text = arr[i] + " ";
        }
        System.out.println(text);
    }
}