import java.io.*;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Person mike = new Person(1, "Mike");
        Person jon = new Person(2, "Jon");

        System.out.println(mike);
        System.out.println(jon);

        try (FileOutputStream fileOutputStream = new FileOutputStream("people.bin")) {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(mike);
            objectOutputStream.writeObject(jon);

            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
