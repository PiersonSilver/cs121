package weekTen;
public class Recursion {
    public void countDown(int i) {
        if (i == 0) {
            System.out.print("Blast Off!");
        } else {
            System.out.print(i + "... ");
            countDown(i-1);
        }
    }

    public void alphaBackwards(char letter) {
        if (letter == 'a') {
            System.out.print(letter);
        } else {
            System.out.print(letter + " ");
            alphaBackwards((char)(letter-1));
        }
    }

    public void coolerCountdown(int i) {
        while (i != 0) {
            System.out.printf("%d...", i);
            i--;
        }
        System.out.println("Blast Off!");
    }

    public void cooleralphaBackwards(char letter) {
        while (letter != 'a') {
            System.out.printf("%c ", letter);
            letter--;
        }
        System.out.println(letter);
    }
}
