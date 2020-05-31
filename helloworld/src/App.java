import java.util.*;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {

        int len1 = s.length();
        int len2 = t1.length();

        if (len1 > len2) return 1;

        if (len1 < len2) return -1;
        return 0;
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return -s.compareTo(t1);
    }
}

public class App {
    public static void main(String[] args) {

        ////////////////////// Sorting Strings ////////////////////////////////
        List<String> animals = new ArrayList<>();

        System.out.println("Sorting Strings");
        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");

        Collections.sort(animals, new StringLengthComparator());
//        Collections.sort(animals, new ReverseAlphabeticalComparator());

        for (String animal : animals) System.out.println(animal);

        ////////////////////// Sorting Numbers ////////////////////////////////
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Sorting Numbers");
        numbers.add(2);
        numbers.add(44);
        numbers.add(1);
        numbers.add(100);
        numbers.add(1000);
        numbers.add(809);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return -t1.compareTo(integer);
            }
        });

        for (Integer number : numbers) System.out.println(number);

        ////////////////////// Sorting arbitary objects ////////////////////////////////
        List<Person> people = new ArrayList<>();

        System.out.println("Sorting Arbitary objects");
        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Charlie"));
        people.add(new Person(2, "Sue"));

        // Sort in order of ID
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {

                if (person.getId() > t1.getId()) return 1;

                if (person.getId() < t1.getId()) return -1;
                return 0;
            }
        });

        for (Person person : people) System.out.println(person);

        System.out.println("n");
        //Sort in order of name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getName().compareTo(t1.getName());
            }
        });

        for (Person person : people) System.out.println(person);
    }

}
