import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try (FileInputStream fileInputStream = new FileInputStream("people.bin")) {

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();

            objectInputStream.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
