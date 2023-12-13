package weekSix.classActivity;

public class testClass {
    public static void main(String[] args) {
       Car altima = new Car("Nissan", "Altima", "Black", 2020);
       altima.displayInfo();
       System.out.println("\n");

       Player LebronJames = new Player("Lebron James", 37, 28.9, true);
       LebronJames.showStats();
       System.out.println("\n");
       LebronJames.isStarter();
    }
}
