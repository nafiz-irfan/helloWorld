import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Person[] people = {new Person(1, "Sue"), new Person(2, "Jon"), new Person(3, "Mark")};

        ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));

        try (FileOutputStream fileOutputStream = new FileOutputStream("test.ser")) {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //write entire array
            objectOutputStream.writeObject(people);

            //write arrayList
            objectOutputStream.writeObject(peopleList);

            //write objects one by one
            objectOutputStream.writeInt(peopleList.size());

            for (Person person : peopleList) {
                objectOutputStream.writeObject(person);
            }

            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
