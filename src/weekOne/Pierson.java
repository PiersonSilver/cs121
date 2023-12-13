package weekOne;

import javax.swing.*;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Scanner;

public class Pierson {
    static Random random = new Random();
    public static void main(String[] args) {
        System.out.println(random.nextInt(1000000, 10000000));

/*
        //System.out.println("ackermann(0, 0) = " + ackermann(0, 0));
        //System.out.println("ackermann(0, 1) = " + ackermann(0, 1));
        //System.out.println("ackermann(1, 1) = " + ackermann(1, 1));
        //System.out.println("ackermann(1, 2) = " + ackermann(1, 2));
        System.out.println("ackermann(1, 3) = " + ackermann(1, 3));
        //System.out.println("ackermann(2, 2) = " + ackermann(2, 2));
        //System.out.println("ackermann(3, 2) = " + ackermann(3, 2));

    }
    public static int ackermann(int m, int n){
        if(m==0){
            return n+1;
        } else if (n==0) {
            System.out.println("n ==0" +ackermann(m-1, n));
            return ackermann(m-1,1);
}
        else{
            System.out.println("full else" + ackermann(m,n-1));
            return ackermann(m-1, ackermann(m,n-1));
        }
    }

        /*int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;
        String majorStatement = "";

        name = "Pierson";
        age = 21;
        gpa = 4.0;
        letterGrade = 'A';
        csMajor = false;

        if (csMajor == true)
            majorStatement = "Their Major is Computer Science.";
        else
            majorStatement = "Their Major is Not Computer Science.";

        System.out.print("Name: ");
        System.out.println(name);
        System.out.print("Age: ");
        System.out.print(age + "\n");
        System.out.print("GPA: ");
        System.out.println(gpa);
        System.out.print("Grade: ");
        System.out.println(letterGrade);
        System.out.print(majorStatement);

        Random rn = new Random();
        System.out.println(rn.nextDouble());
        System.out.println(rn.nextFloat());

        int x = -100;
        int v = 7;
        displayValue(v);
        System.out.printf("%,.2f", 12.7801);
        System.out.println(72 % 9 * 2 - 14 +10);

        int f = 4, y = 33;
        double z;
        z = (double)(y/f);
        System.out.println(z);

        final int w = 11, j=4;
        //j+=w;
        System.out.println("x="+w+"y="+j);

        String ott = "123";
        Integer.parseInt("123");

        System.out.println(calculateAverage(10,20));

    }public static void displayValue(int value){

        System.out.println(value);
    }
    Scanner keyboard = new Scanner(System.in);
    public static double calculateAverage(double num1, double num2){
        return (num1+num2)/2;
    */
    }
}
