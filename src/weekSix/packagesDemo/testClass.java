package weekSix.packagesDemo;

public class testClass {
    public static void main(String[] args) {
        Character char1 = new Character("Steve", "Slap", 25, 15, 6);
        System.out.println(char1.Name);
        System.out.println(char1.Move);
        //System.out.println(char1.Speed);
        //System.out.println(char1.HP);
        //System.out.println(char1.Attack);

        System.out.println(char1.getName());
        System.out.println(char1.getMove());
        System.out.println(char1.getSpeed());
        //System.out.println(char1.getHP());
        System.out.println(char1.getAttack());
        System.out.println();
        char1.displayStats();





    }
}
