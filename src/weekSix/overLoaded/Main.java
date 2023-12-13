package weekSix.overLoaded;

public class Main {
    public static void main(String[] args) {
        Character c1 = new Character();
        Character c2 = new Character("Steve");
        Character c3 = new Character("John", "Quick Attack", 25, 15, 6);
        System.out.println(c3.getName() + "'s Original Attack Stat is " + c3.getAttack());
        c3.setAttack(10);
        System.out.println(c3.getName() + "'s New Attack Stat is " + c3.getAttack());
        c3.setAttack(10, c3.getSpeed());
        System.out.println(c3.getName() + "'s New Attack Stat has Changed to " + c3.getAttack() + " because of their High Speed.");
    }
}
