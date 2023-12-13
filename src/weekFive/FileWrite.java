package weekFive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        try {
            //FileWriter write = new FileWriter("group");
            PrintWriter output = new PrintWriter("group");
            output.print("Name Age Height");
            String name = JOptionPane.showInputDialog("Enter Name:");
            String age = JOptionPane.showInputDialog("Enter Age:");
            String height = JOptionPane.showInputDialog("Enter Height:");
            output.printf("\n%s %s %s",name,age,height);
            //write.close();
            output.close();
        }catch(FileNotFoundException e) {
            System.err.println("File Not Found");
        }
        System.out.println("Done");
    }
}
