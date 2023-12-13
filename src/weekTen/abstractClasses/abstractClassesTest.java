package weekTen.abstractClasses;

public class abstractClassesTest {
    public static void main(String[] args) {
        User test1 = new User(123, "test1", "test1@gmail.com", 2020);
        Admin test2 = new Admin(14, "admin1", "admin@gmail.com", 2008);

        System.out.println(test1.accountStatus());
        System.out.println(test2.accountStatus());
    }
}
