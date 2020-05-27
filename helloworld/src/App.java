import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("E:/IdeaProjects/helloWorld/helloworld/src/test.txt");

        BufferedReader br = null;

        try {
            FileReader fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);

            String line;

            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found: " + file.toString());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            }catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
                e.printStackTrace();
            }catch (NullPointerException ex){}
        }
    }
}

