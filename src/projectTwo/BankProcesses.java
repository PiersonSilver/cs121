package projectTwo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class BankProcesses {
    private Bank fleecaBank = new Bank();
    private HashMap<Integer,ArrayList<Object>> fleecaHash;
    BankProcesses(HashMap<Integer, ArrayList<Object>> Hash){
        this.fleecaHash = Hash;
    }

    public void getUserInfo(int id) {
        if (!fleecaHash.containsKey(id)) {
            System.out.println("User Does Not Exist");
        } else {
            ArrayList<Object> info = fleecaHash.get(id);
            System.out.println("***User Information***");
            System.out.printf("User ID: %d\nName: %s\nRouting Number: %d\nBalance: $%.2f\n", id, info.get(0), Integer.parseInt(info.get(1).toString()), Double.parseDouble(info.get(2).toString()));

        }
    }
    public Double getBalance(int id){
        if(!fleecaHash.containsKey(id)){
            return null;
        }
        else {
            return Double.parseDouble(fleecaHash.get(id).get(2).toString());
        }
    }
    public void adjustBalance(int id, double change){
        if(!fleecaHash.containsKey(id)){
            System.out.println("User Does Not Exist");
        }
        else {
            ArrayList<Object> info = fleecaHash.get(id);
            if (change >= 0) {
                info.set(2, BigDecimal.valueOf(Double.parseDouble(info.get(2).toString())).add(BigDecimal.valueOf(change)));
                System.out.printf("$%.2f Added to %s's Balance\n", Math.abs(change), info.get(0));
            } else {
                info.set(2, BigDecimal.valueOf(Double.parseDouble(info.get(2).toString())).subtract(BigDecimal.valueOf(Math.abs(change))));
                System.out.printf("$%.2f Deducted from %s's Balance\n", Math.abs(change), info.get(0));
            }
            fleecaHash.replace(id, info);
        }
    }
    public void transferFunds(int from, int to, double amount){
        if(!fleecaHash.containsKey(from)){
            System.out.println("Account ID: " + from + " Does Not Exist");
        }
        else if (!fleecaHash.containsKey(to)) {
            System.out.println("Account ID: " + to + " Does Not Exist");
        }
        else {
            ArrayList<Object> info1 = fleecaHash.get(from);
            ArrayList<Object> info2 = fleecaHash.get(to);
            info2.set(2, BigDecimal.valueOf(Double.parseDouble(info2.get(2).toString())).add(BigDecimal.valueOf(amount)));
            info1.set(2, BigDecimal.valueOf(Double.parseDouble(info1.get(2).toString())).subtract(BigDecimal.valueOf(amount)));
            System.out.printf("$%.2f Transferred from %s to %s\n", amount, info1.get(0), info2.get(0));
        }
    }
}
