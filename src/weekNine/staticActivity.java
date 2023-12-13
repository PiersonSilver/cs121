package weekNine;

public class staticActivity {
    private String firstname, lastname;
    private int age;
    static int instanceCount;
    staticActivity(String fn, String ln, int age){
        this.firstname = fn;
        this.lastname = ln;
        this.age = age;
        instanceCount ++;
    }
    static int count(){
        return instanceCount;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
