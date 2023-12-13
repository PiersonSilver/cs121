package weekFifteen.dateFormatActivity;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int cal = Integer.parseInt(JOptionPane.showInputDialog("How Many Calories Per Day?"));
        String start = JOptionPane.showInputDialog("Input Start Date (mm/dd/yyyy format):");
        String end = JOptionPane.showInputDialog("Input End Date (mm/dd/yyyy format):");
        TotalCalories test = new TotalCalories();
        System.out.printf("Total Calories Over the Duration of the Diet: %,d", test.dietTotal(cal, start, end));
    }
}
