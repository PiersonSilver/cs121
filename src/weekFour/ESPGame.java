package weekFour;
import java.util.Random;
import java.util.Scanner;
public class ESPGame {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner console = new Scanner(System.in);
        String color = "";
        int correct = 0;
        for(int i = 1; i <=10; i++) {
            int rando = rn.nextInt(5);
            switch (rando) {
                case 0 -> color = "red";
                case 1 -> color = "green";
                case 2 -> color = "blue";
                case 3 -> color = "orange";
                case 4 -> color = "yellow";

            }
            System.out.printf("%d. What Color Has the Computer Chosen?\n", i);
            String guess = console.nextLine();
            System.out.println("The computer chose " + color);
            if (guess.toLowerCase().equals(color))
                correct += 1;
        }
        System.out.printf("\nYou got %d out of 10 Correct", correct);


        }
    }

