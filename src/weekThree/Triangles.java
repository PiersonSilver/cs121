package weekThree;

import javax.swing.JOptionPane;

public class Triangles {
    public static void main(String[] args) {
        int side1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose a length for the first side of the triangle: "));
        int side2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose a length for the second side of the triangle: "));
        int side3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose a length for the third side of the triangle: "));


        if (side1 == side2 && side1 == side3)
            JOptionPane.showMessageDialog(null, "Your Triangle is Equilateral");
        else
            if (side1 == side2 || side1 == side3 || side2 == side3)
                JOptionPane.showMessageDialog(null, "Your Triangle is Isosceles");
            else
                JOptionPane.showMessageDialog(null, "Your Triangle is Scalene");



    }
}
