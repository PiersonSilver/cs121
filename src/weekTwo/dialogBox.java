package weekTwo;

import javax.swing.JOptionPane;

public class dialogBox {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is Your Name?");

        //after showMessageDialog(), then "null, ___"
        JOptionPane.showMessageDialog(null, name);
        System.out.print(name);
    }
}
