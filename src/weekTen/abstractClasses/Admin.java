package weekTen.abstractClasses;

public class Admin extends UserProfile{
    int year = 2023;
    public Admin(int id, String name, String email, int year) {
        super(id, name, email, year);
    }

    @Override
    public String accountStatus() {
        if((year-getYearOfCreation()<5)){
            return "Your account is NOT eligible for Administrative Privileges";
        }
        else {
            return "Your account IS eligible for Administrative Privileges";
        }
    }
}
