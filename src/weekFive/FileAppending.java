package weekFive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppending {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter write = new FileWriter("course", true);
            PrintWriter output = new PrintWriter(write);

            String course = JOptionPane.showInputDialog("Enter A Course Name: ");
            String credits = JOptionPane.showInputDialog("Enter Course Credits: ");
            String score = JOptionPane.showInputDialog("Enter Course Score: ");
            output.printf("\n%s %s %s",course,credits,score);

            write.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("Kill Yourself");
        }
    }
}
