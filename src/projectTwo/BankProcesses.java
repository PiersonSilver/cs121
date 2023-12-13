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
            info.set(2, getBalance(id) + change);
            fleecaHash.replace(id, info);
            if (change >= 0) {
                System.out.printf("$%.2f Added to %s's Balance\n", Math.abs(change), info.get(0));
            } else {
                System.out.printf("$%.2f Deducted from %s's Balance\n", Math.abs(change), info.get(0));
            }
        }
    }
    public void tranferFunds(int from, int to, double amount){
        if(!fleecaHash.containsKey(from) || !fleecaHash.containsKey(to)){
            System.out.println("One or More Inputted Account Does Not Exist");
        }
        else {
            ArrayList<Object> info1 = fleecaHash.get(from);
            ArrayList<Object> info2 = fleecaHash.get(to);
            info2.set(2, BigDecimal.valueOf((Double)info2.get(2)).add(BigDecimal.valueOf(amount)));
            info1.set(2, BigDecimal.valueOf((Double) info1.get(2)).subtract(BigDecimal.valueOf(amount)));
            System.out.printf("$%.2f Transferred from %s to %s\n", amount, info1.get(0), info2.get(0));
        }
    }
}
