import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = "C:/Users/John/Desktop/example.txt";
        String fileName = "/Users/jetyue/Desktop/JEttesting.txt";

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        int count = 1;

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if(line!= null && !line.isEmpty()) {
                System.out.println(count + ": " + line);
            }
            count++;
        }

        in.close();
    }

}