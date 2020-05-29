import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(1000);

        //retrieving
        System.out.println(numbers.get(0));

        System.out.println("nIteration #1: ");
        //indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //removing items
        numbers.remove(numbers.size() - 1);

        System.out.println("nIteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);
        }

    }
}
