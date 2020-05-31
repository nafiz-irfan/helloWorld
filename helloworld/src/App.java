import java.util.*;

public class App {
    public static void main(String[] args) {

        Set<String> set1 = new TreeSet<>();

        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("duck");
        set1.add("cow");

        if (set1.isEmpty()) System.out.println("Set is empty after adding (no!)");

        // Adding duplicate items does nothing.
        set1.add("duck");

        for (String animal : set1) System.out.println(animal);

        if (set1.contains("aardvark")) System.out.println("Set contains aardvark");

        if (set1.contains("cat")) System.out.println("Set contains cat");

        /// set2 contains some common elements with set1, and some new
        Set<String> set2 = new TreeSet<>();

        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("ant");

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); //keep similarities between set 1 and set 2

        System.out.println(intersection);

        for (String sameAnimal : intersection) System.out.println(sameAnimal);

        Set<String> difference = new HashSet<>(set2);

        difference.removeAll(set1); //removes differences between set1 and set2, prints what is left of set2

        for (String diffAnimal : difference) System.out.println(diffAnimal);
    }

}
