public class While {
    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5, 6};

        int counter = 0;

        while (counter < numbers.length){
            System.out.println(numbers[counter] * 2);
            counter++;
        }
    }
}
