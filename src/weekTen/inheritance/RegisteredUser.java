package weekTen.inheritance;

public class RegisteredUser extends User{
    private int UserID;
    public RegisteredUser(String name, String password, String email,int id) {
        super(name, password, email);
        this.UserID = id;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }
    @Override
    public String toString(){
        return String.format("User ID: %d\nName: %s\nEmail: %s\nPassword: %s\n", getUserID(), getName(), getEmail(), getPassword());
    }
}
