import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i = 0; i<30; i++) {
            Random random = new Random();
            int rand = random.nextInt(100);
            treeSet.add(rand);
        }

        Iterator<Integer> iterator = treeSet.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}