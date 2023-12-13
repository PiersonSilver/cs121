package weekTen.inheritance;

public class AdminUser extends User{
    private boolean AdminStatus;
    public AdminUser(String name, String password, String email, boolean admin) {
        super(name, password, email);
        this.AdminStatus = admin;
    }

    public boolean getAdminStatus() {
        return AdminStatus;
    }

    public void setAdminStatus(boolean admin) {
        AdminStatus = admin;
    }
    @Override
    public String toString(){
        return String.format("Admin Status: %b\nName: %s\nEmail: %s\nPassword: %s\n", getAdminStatus(), getName(), getEmail(), getPassword());

    }
}
