package weekFive;

import java.util.Scanner;

public class MethodsActivity {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double l = getLength();
        double w = getWidth();
        displayData(l,w,getArea(l,w));
        console.close();
    }
    public static double getLength(){
        System.out.println("Enter Length of Rectangle");
        return console.nextDouble();
    }
    public static double getWidth(){
        System.out.println("Enter Width of Rectangle");
        return console.nextDouble();
    }
    public static double getArea(double l, double w){
        return (l*w);
    }
    public static void displayData(double l, double w, double area){
        System.out.printf("Rectangle Length: %.2f\nRectangle Width: %.2f\nRectangle Area: %.2f",l,w,area);
    }
}
