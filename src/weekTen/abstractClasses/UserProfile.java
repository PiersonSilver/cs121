package weekTen.abstractClasses;

public abstract class UserProfile {
    private int UserID;
    private String Name, Email;
    public int YearOfCreation;
    public UserProfile(int id, String name, String email, int year){
        this.UserID = id;
        this.Name = name;
        this.Email = email;
        this.YearOfCreation = year;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public int getYearOfCreation() {
        return YearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        YearOfCreation = yearOfCreation;
    }

    public abstract String accountStatus();
}
