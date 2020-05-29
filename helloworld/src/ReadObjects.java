import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try (FileInputStream fileInputStream = new FileInputStream("test.ser")) {

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //read entire array
            Person[] people = (Person[]) objectInputStream.readObject();

            // Read entire arraylist
            ArrayList<Person> peopleList = (ArrayList<Person>) objectInputStream.readObject();
//            System.out.println(peopleList);

            for (Person person : people) {
                System.out.println(person);
                System.out.println("=====================================");
            }

            for (Person person : peopleList) {
                System.out.println(person);
                System.out.println("-------------------------------------");
            }

            //Read objects one by one
            int num = objectInputStream.readInt();

            for (int i = 0; i < num; i++) {
                Person person = (Person) objectInputStream.readObject();
                System.out.println(person);
                System.out.println("...................................");
            }

            objectInputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
