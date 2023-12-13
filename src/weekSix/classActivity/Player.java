package weekSix.classActivity;

public class Player {
    String Name;
    int Age;
    double PPG;
    boolean Starter;

    Player(String name, int age, double ppg, boolean starter){
        this.Name = name;
        this.Age = age;
        this.PPG = ppg;
        this.Starter = starter;
    }
    public void showStats(){
        System.out.printf("Name: %s\nAge: %d\nPoints per Game: %.1f\nIs Starter: %b",Name,Age,PPG,Starter);
    }
    public void isStarter(){
        if (Starter){
            System.out.println(Name + " is a Starter");
        }
        else{
            System.out.println(Name + " is not a Starter");
        }
    }
}
