package weekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("course");
        //File file2 = new File("C:\\Users\\Cityw\\OneDrive\\Desktop\\Ball State Stuff\\CS121\\cs121\\course");
        try {
            Scanner console = new Scanner(file);
            String header = console.nextLine();
            System.out.println(header);
            while (console.hasNextLine()) {
                //String line = console.nextLine();
                //System.out.println(line);
                String course = console.next();
                int credits = Integer.parseInt(console.next());
                int score = Integer.parseInt(console.next());
                System.out.printf("%-7s %3d %7d \n", course, credits, score);
            }
            console.close();
        }catch(FileNotFoundException e){
            //e.printStackTrace();
            System.err.println("Fuck You ****");
        }
    }
}
