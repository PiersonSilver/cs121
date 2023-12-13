package weekSixteen;

public class Student {
    String name;
    int id;
    double gpa;
    Student(String Name, int ID, double GPA){
        this.name = Name;
        this.id = ID;
        this.gpa = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
