package weekFour;
import java.util.Scanner;
public class AverageRainfall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Number of Years:");
        int years = console.nextInt();
        int inches = 0;
        for(int y = 1; y <= years; y++){
            for(int m = 1; m <= 12; m++){
                System.out.printf("Enter inches of rainfall for year %d month %d: ",y,m);
                inches += console.nextInt();
            }
        }
        System.out.printf("\nNumber of Months: %d",(years*12));
        System.out.printf("\nTotal Inches of Rainfall: %d", inches);
        System.out.printf("\nAverage Rainfall Per Month for %d Years: %f",years,((double)inches/(double)(years*12)));
    }
}
