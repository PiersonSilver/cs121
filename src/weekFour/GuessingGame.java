package weekFour;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int target = (int)(Math.random()*100);
        if(target==0)
            target = 1;
        int guesses = 0;
        System.out.println("Guess a Number between 1 and 100, or enter 'q' if you give up");
        String input = console.nextLine();
        while(!input.equals("q")) {
            int guess = Integer.parseInt(input);
            guesses += 1;
            if(guess == target){
                System.out.println("Correct!");
                System.out.printf("Number of Guesses: %d", guesses);
                return;
            }
            else {
                if (guess < target) {
                    System.out.println("Too Low. Guess Again:");
                }
                else {
                    System.out.println("Too High. Guess Again:");
                }
                input = console.nextLine();
            }
        }
        System.out.printf("Quitter... The number was %d", target);

    }
}
