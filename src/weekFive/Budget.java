package weekFive;

import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {

        //Partner: Eddie

        Scanner console = new Scanner(System.in);
        System.out.println("Enter Your Budget: ");
        double budget = console.nextDouble();
        double expenses = 0;
        int i = 1;
        System.out.printf("Enter Expense %d (or enter 0 if you're finished): ", i);
        double input = console.nextDouble();
        while (input > 0) {
            expenses += input;
            i++;
            System.out.printf("Enter Expense %d (or enter 0 if you're finished): ", i);
            input = console.nextDouble();
        }
        if(expenses>budget){
            System.out.printf("Budget: $%.2f\nExpenses: $%.2f\nOver Budget By $%.2f",budget,expenses,(expenses-budget));
        }
        else{
            System.out.printf("Budget: $%.2f\nExpenses: $%.2f\nUnder Budget By $%.2f",budget,expenses,(budget-expenses));
        }
    }
}
