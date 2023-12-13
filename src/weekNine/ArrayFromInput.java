package weekNine;

import javax.swing.*;

public class ArrayFromInput {
    public static void main(String[] args) {
        String[] names = new String[5];
        int[] age = new int[5];
        double[] ppg = new double[5];

        //fill
        JOptionPane.showMessageDialog(null,"Enter Your Starting Lineup");
        for(int i = 1; i <= names.length; i++){
            names[i-1] = JOptionPane.showInputDialog("Insert the Name of Player " + i);
            age[i-1] = Integer.parseInt(JOptionPane.showInputDialog("Insert the Age of Player " + i));
            ppg[i-1] = Double.parseDouble(JOptionPane.showInputDialog("Insert Player "+i+"'s Points Per Game"));
        }
        //print
        System.out.printf("%-14s %s  %s\n", "Name", "Age", "PPG");
        for(int i = 0; i < names.length; i++){
            System.out.printf("%-14s %d   %.1f\n", names[i], age[i], ppg[i]);
        }

    }
}
