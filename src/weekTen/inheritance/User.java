package weekTen.inheritance;

public class User {
    private String Name, Password, Email;
    public User(String name, String password, String email){
        this.Name = name;
        this.Password = password;
        this.Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public String toString(){
        return String.format("Name: %s\nEmail: %s\nPassword: %s\n", getName(), getEmail(), getPassword());
    }
}
