package weekTwo;

import java.util.Scanner;

public class UserMath {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Pick a Number: ");
        int num1 = console.nextInt();
        System.out.print("Pick another Number: ");
        int num2 = console.nextInt();

        //System.out.println("Addition: " + (num1 + num2));
        //System.out.println("Subtraction: " + (num1 - num2));
        //System.out.println("Multiplication: " + (num1*num2));
        //System.out.println("Division: " + ((double)num1/(double)num2));
        //System.out.println("Square Root of First Number: " + Math.sqrt((double)num1));
        //System.out.println("First Number to the Power of the Second Number: " + Math.pow((double)num1, (double)num2));
        //System.out.println("Logarithm: " + Math.log((double)num1));

        //System.out.println("\n\n");
        System.out.printf("%d + %d = %d",num1,num2,(num1+num2));
        System.out.printf("\n%d - %d = %d",num1,num2,(num1-num2));
        System.out.printf("\n%d * %d = %d",num1,num2,(num1*num2));
        System.out.printf("\n%d / %d = %f",num1,num2,((double)num1/(double)num2));
        System.out.printf("\nSquare Root of %d = %f",num1,Math.sqrt(num1));
        System.out.printf("\nSquare Root of %d = %f",num2,Math.sqrt(num2));
        System.out.printf("\n%d to the Power of %d = %d",num1,num2,(int)Math.pow(num1,num2));
        System.out.printf("\nThe Log of %d = %f",num1,Math.log((double)num1));
        System.out.printf("\nThe Log of %d = %f",num2,Math.log((double)num2));
        console.close();
    }
}
