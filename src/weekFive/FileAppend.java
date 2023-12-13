package weekFive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter write = new FileWriter("group",true);
            PrintWriter output = new PrintWriter(write);
            String name = JOptionPane.showInputDialog("Enter Name:");
            String age = JOptionPane.showInputDialog("Enter Age:");
            String height = JOptionPane.showInputDialog("Enter Height:");
            output.printf("\n%s %s %s",name,age,height);
            write.close();
            output.close();
        }catch(FileNotFoundException e) {
            System.err.println("File Not Found");
        }
        System.out.println("Done");
    }
}
