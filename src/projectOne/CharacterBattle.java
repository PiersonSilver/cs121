package projectOne;

import java.util.Scanner;

public class CharacterBattle {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What Score Would You Like to Play To? ");
        int playTo = console.nextInt();
        console.nextLine();
        int round = 1;
        int p1score = 0;
        int p2score = 0;
        while (p1score < playTo && p2score < playTo) {
            System.out.println("\nRound " + round);
            System.out.println("\nPlayer 1\n___________________");
            Player p1 = selectCharacter();
            System.out.println("\nPlayer 2\n___________________");
            Player p2 = selectCharacter();
            int turn = 1;
            while (p1.getHP() > 0 && p2.getHP() > 0) {
                System.out.printf("\n\nTurn %d\n", turn);
                battle(p1, p2);
                turn += 1;
            }
            if (p1.getHP() == 0) {
                System.out.println("\nPlayer 2 Wins Round " + round);
                p2score += 1;
            } else {
                System.out.println("\nPlayer 1 Wins Round " + round);
                p1score += 1;
            }
            round += 1;
            System.out.printf("\nScore\nPlayer 1: %d\nPlayer 2: %d\n", p1score, p2score);
        }
        if(p1score == playTo){
            System.out.println("\nPlayer 1 Wins");
        }
        else{
            System.out.println("\nPlayer 2 Wins");
        }
    }

    public static void battle(Player p1, Player p2) {
        boolean p1f = false;
        if(p1.getSpeed()==p2.getSpeed()){
            if(Math.random()>.5) {
                p1f = true;
            }
        }
        if(p1.getSpeed()>p2.getSpeed() || p1f){
            System.out.printf("\nPlayer 1 Attacks, dealing %d Damage to Player 2", p1.getAttack());
            p2.setHP(p2.getHP(), p1.getAttack());
            System.out.printf("\nPlayer 2's Health is now %d", p2.getHP());
            if (p2.getHP() <= 0){
                System.out.print("\nPlayer 2 has Fallen");
                return;
            }
            System.out.printf("\nPlayer 2 Attacks Player 1 for %d Damage", p2.getAttack());
            p1.setHP(p1.getHP(), p2.getAttack());
            System.out.printf("\nPlayer 1's Health is now %d", p1.getHP());
            if (p1.getHP() <= 0 ){
                System.out.print("\nPlayer 1 has Fallen");
                return;
            }
        }
        else{
            System.out.printf("\nPlayer 2 Attacks, dealing %d Damage to Player 1", p2.getAttack());
            p1.setHP(p1.getHP(), p2.getAttack());
            System.out.printf("\nPlayer 1's Health is now %d", p1.getHP());
            if (p1.getHP() <= 0 ){
                System.out.print("\nPlayer 1 has Fallen");
                return;
            }
            System.out.printf("\nPlayer 1 Attacks Player 2 for %d Damage", p1.getAttack());
            p2.setHP(p2.getHP(), p1.getAttack());
            System.out.printf("\nPlayer 2's Health is now %d", p2.getHP());
            if (p2.getHP() <= 0){
                System.out.print("\nPlayer 2 has Fallen");
                return;
            }
        }
    }

    public static Player characterSelect() {
        System.out.print("Would You Like to Select a Preset Character?");
        if (console.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("What Preset Would You Like?\nAssassin: High Speed, Moderate Power, Low HP\nWarrior: High HP, Low Power, Low Speed\nKnight: Moderate Speed, Moderate Power, Moderate HP");
            String preset = console.nextLine().toLowerCase();
            switch (preset) {
                case "assassin":
                    Player preA = new Player("Assassin", "Stab", 25, 23, 8);
                     return preA;
                case "warrior":
                    Player preW = new Player("Warrior", "Punch", 10, 40, 6);
                    return preW;
                case "knight":
                    Player preK = new Player("Knight", "Slash", 15, 32, 7);
                    return preK;
                default:
                    Player preD = new Player("Knight", "Slash", 15, 32, 7);
                    return preD;
            }
        } else {
            System.out.print("Choose Your Name: ");
            String n = console.nextLine();
            System.out.print("Choose Your Move Name: ");
            String m = console.nextLine();
            System.out.print("Choose Your Speed: ");
            int s = console.nextInt();
            System.out.print("Choose Your HP: ");
            int hp = console.nextInt();
            System.out.print("Choose Your Attack Power: ");
            int a = console.nextInt();
            console.nextLine();
            Player created = new Player(n, m, s, hp, a);
            return created;

        }
    }
    public static Player selectCharacter(){
        System.out.println("Select Your Character\nAssassin: High Speed, Moderate Power, Low HP\nWarrior: High HP, Low Power, Low Speed\nKnight: Moderate Speed, Moderate Power, Moderate HP");
        String preset = console.nextLine().toLowerCase();
        switch (preset) {
            case "assassin":
                Player preA = new Player("Assassin", "Stab", 25, 23, 8);
                return preA;
            case "warrior":
                Player preW = new Player("Warrior", "Punch", 10, 40, 6);
                return preW;
            case "knight":
                Player preK = new Player("Knight", "Slash", 15, 32, 7);
                return preK;
            default:
                Player preD = new Player("Knight", "Slash", 15, 32, 7);
                return preD;
        }
    }
}
