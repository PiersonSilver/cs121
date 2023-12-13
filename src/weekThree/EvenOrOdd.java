package weekThree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Pick a Number: ");
        int number = console.nextInt();
        if(number % 2==0)
            System.out.println("The Number You Entered is Even");
        else
            System.out.println("The Number You Entered is Odd");
    }
}
