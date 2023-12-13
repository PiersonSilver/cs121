package weekSix.classActivity;

public class Car {
    String Make,Model,Color;
    int Year;
    Car(String make, String model, String color, int year){
        this.Make = make;
        this.Model = model;
        this.Color = color;
        this.Year = year;
    }
    public void displayInfo(){
        System.out.printf("Make: %s\nModel: %s\nColor: %s\nYear: %d",Make,Model,Color,Year);;
    }
}
