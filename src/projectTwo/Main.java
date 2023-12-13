package projectTwo;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
        public static void main(String[] args) throws IOException {
            Bank fleecaBank = new Bank();
            String startUp = JOptionPane.showInputDialog("Start from empty file? Yes or No: ");
            if(startUp.equalsIgnoreCase("yes")){
                fleecaBank.addUser("Theodore Hinklebottom", 43.21);
                fleecaBank.addUser("Hank Twinklehorn", 1203.46);
                fleecaBank.addUser("Jeffery Stinkerhunk", 125.99);
            }
            else{
                fleecaBank.setHash(fleecaBank.readRecords("bankRecords.txt"));
            }
            fleecaBank.displayRecords();
            //System.out.println(fleecaBank.readRecords("bankRecords.txt"));
            //fleecaBank.setHash(fleecaBank.readRecords("bankRecords.txt"));
            //fleecaBank.displayRecords();
            fleecaBank.addUser("Thomas Thunderspank", 1.14);
            //fleecaBank.inputUser();

            fleecaBank.displayRecords();

            fleecaBank.writeRecords(fleecaBank.getHash(), "bankRecords.txt");
            fleecaBank.setHash(fleecaBank.readRecords("bankRecords.txt"));
            System.out.println(fleecaBank.readRecords("bankRecords.txt"));

            //fleecaBank.removeUser(2);
            fleecaBank.displayRecords();
            fleecaBank.writeRecords(fleecaBank.getHash(), "bankRecords.txt");
            //fleecaBank.inputUser();
            //fleecaBank.writeRecords(fleecaBank.getHash(), "bankRecords.txt");

            BankProcesses fleecaProcesses = new BankProcesses(fleecaBank.getHash());

            for(int id: fleecaBank.getHash().keySet()){
                fleecaProcesses.getUserInfo(id);
            }
            System.out.println("ID 1 Balance: $" + fleecaProcesses.getBalance(1));
            fleecaProcesses.adjustBalance(1, -22.32);
            System.out.println("ID 1 New Balance: $" + fleecaProcesses.getBalance(1));
            System.out.println("ID 3 Balance: $" + fleecaProcesses.getBalance(3));
            fleecaProcesses.adjustBalance(3, 122.99);
            System.out.println("ID 3 New Balance: $" + fleecaProcesses.getBalance(3));

            fleecaProcesses.tranferFunds(3,1,154.55);
            System.out.println("ID 1 New Balance: $" + fleecaProcesses.getBalance(1));
            System.out.println("ID 3 New Balance: $" + fleecaProcesses.getBalance(3));

        }

}