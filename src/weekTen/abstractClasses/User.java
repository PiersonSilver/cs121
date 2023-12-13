package weekTen.abstractClasses;

public class User extends UserProfile{
    int year = 2023;
    public User(int id, String name, String email, int year) {
        super(id, name, email, year);
    }

    @Override
    public String accountStatus() {
        return "Account Age: " + (year - getYearOfCreation()) + " Years";
    }
}
