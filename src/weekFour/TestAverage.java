package weekFour;
import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int students = console.nextInt();
        System.out.println("Enter Number of Tests Per Student: ");
        int tests = console.nextInt();
        for(int i = 1; i <= students; i++){
            System.out.println("Student Number "+ i);
            System.out.println("-----------------");
            int scores = 0;
            for(int x = 1; x <= tests; x++){
                System.out.printf("Enter Score %d:",x);
                scores += console.nextInt();
            }
            System.out.printf("\nThe Average for Student %d is %f\n",i, ((double)scores/(double)tests));
        }
    }
}
