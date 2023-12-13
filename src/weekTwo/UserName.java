package weekTwo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class UserName {
    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        //System.out.println("What is Your Name? (First and Last Name) ");
        //String name = console.nextLine();

        String name = JOptionPane.showInputDialog("What is Your Name?");
        JOptionPane.showMessageDialog(null, name.toUpperCase());
        JOptionPane.showMessageDialog(null, name.toLowerCase());
        //StringBuilder reversedName = new StringBuilder(name);

        //reverse
        String rev = "";
        for (int i = name.length()-1; i >= 0; i--)
            rev = rev + name.charAt(i);
        JOptionPane.showMessageDialog(null,rev);

    }
}
