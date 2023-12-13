package weekTwo;

import java.util.Scanner;

public class intDiv {
    public static void main(String[] args) {
        int numOne = 1;
        int numTwo = 4;
        System.out.println((double)numOne/(double)numTwo);

        //Scanner Instance
        Scanner console = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = console.nextLine();
        System.out.print("How Old Are You? ");
        //int age = console.nextInt() or \/
        int age = Integer.parseInt(console.nextLine());
        System.out.print("What is 5/2? ");
        double answer = console.nextDouble();
        System.out.print(name + " is " + age + " years old and believes 5/2 = " + answer);

        //Closes out of scanner

        String color = "blue";
        System.out.println(color);
        color = color.concat(" red");
        System.out.print(color);
        console.close();
    }
}
