package weekThree;

import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        String username = "PiersonSilver";
        String password = "Password123";

        String userInput = JOptionPane.showInputDialog("Username: ");
        String passInput = JOptionPane.showInputDialog("Password: ");

        boolean u = (userInput.equals(username));
        boolean p = (passInput.equals(password));

        if (u == true && p == true)
            JOptionPane.showMessageDialog(null,"Welcome to CS121");
        if (u == false && p == true)
            JOptionPane.showMessageDialog(null, "Username is incorrect");
        if (u == true && p == false)
            JOptionPane.showMessageDialog(null, "Password is Incorrect");
        if (u == false && p == false)
            JOptionPane.showMessageDialog(null, "Both Inputs are Incorrect");

    }
}
