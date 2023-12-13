package weekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("group");
        try {
            Scanner console = new Scanner(file);
            String header = console.nextLine();
            System.out.println(header);
            while (console.hasNextLine()) {
                String name = console.next();
                int age = Integer.parseInt(console.next());
                String height = console.next();
                System.out.printf("%-7s %3d %s \n", name, age, height);
            }
        }catch (FileNotFoundException e){
            System.err.println("File Not Found");
        }
    }
}
