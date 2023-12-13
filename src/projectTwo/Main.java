package projectTwo;

import javax.swing.*;
import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException {
            Bank fleecaBank = new Bank();

            System.out.println();
            System.out.println();
            System.out.println("File Writing/Reading + User Adding/Removing");
            System.out.println();
            System.out.println();

            String startUp = JOptionPane.showInputDialog("Start from empty file? Yes or No: ");
            if(startUp.equalsIgnoreCase("yes")){
                fleecaBank.addUser("Theodore Hinklebottom", 43.21);
                fleecaBank.addUser("Hank Twinklehorn", 1203.46);
                fleecaBank.addUser("Jeffery Stinkerhunk", 942.43);
            }
            else{
                fleecaBank.setHash(fleecaBank.readRecords("bankRecords.txt"));
            }
            fleecaBank.displayRecords();

            fleecaBank.addUser("Thomas Thunderspank", 1.14);
            fleecaBank.displayRecords();

            fleecaBank.writeRecords(fleecaBank.getHash(), "bankRecords.txt");
            fleecaBank.setHash(fleecaBank.readRecords("bankRecords.txt"));

            fleecaBank.removeUser(2);
            fleecaBank.displayRecords();
            fleecaBank.writeRecords(fleecaBank.getHash(), "bankRecords.txt");

            BankProcesses fleecaProcesses = new BankProcesses(fleecaBank.getHash());

            System.out.println();
            System.out.println();
            System.out.println("User Info Prints");
            System.out.println();
            System.out.println();

            for(int id: fleecaBank.getHash().keySet()){
                fleecaProcesses.getUserInfo(id);
            }

            System.out.println();
            System.out.println();
            System.out.println("Balance Adjusting and Transferring");
            System.out.println();
            System.out.println();

            System.out.println("ID 1 Balance: $" + fleecaProcesses.getBalance(1));
            fleecaProcesses.adjustBalance(1, -22.32);
            System.out.println("ID 1 New Balance: $" + fleecaProcesses.getBalance(1));
            System.out.println("ID 4 Balance: $" + fleecaProcesses.getBalance(4));
            fleecaProcesses.adjustBalance(4, 122.99);
            System.out.println("ID 3 New Balance: $" + fleecaProcesses.getBalance(4));

            System.out.println();
            System.out.println("Trying to transfer from nonexistent ID");
            fleecaProcesses.transferFunds(1,2,33.24);
            System.out.println();

            System.out.println("actual transfer");
            System.out.println("ID 1 Balance: $" + fleecaProcesses.getBalance(1));
            System.out.println("ID 3 Balance: $" + fleecaProcesses.getBalance(3));
            fleecaProcesses.transferFunds(3,1,154.55);
            System.out.println("ID 1 New Balance: $" + fleecaProcesses.getBalance(1));
            System.out.println("ID 3 New Balance: $" + fleecaProcesses.getBalance(3));

            fleecaBank.inputUser();
            fleecaBank.displayRecords();
            fleecaBank.writeRecords(fleecaBank.getHash(), "bankRecords.txt");
        }

}