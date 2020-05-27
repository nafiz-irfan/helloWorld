import java.io.*;

public class App {
    public static void main(String[] args) {

        File file = new File("test.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))){
            br.write("This is first write to the file.\n");
            br.write("This is second write to the file.");

            br.newLine();
            br.write("This is third write to the file after new line.");

        }catch (
                IOException e) {
            System.out.println("Unable to read file: " + file.toString());
            e.printStackTrace();
        }
    }

}

