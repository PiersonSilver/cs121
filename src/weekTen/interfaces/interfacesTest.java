package weekTen.interfaces;

public class interfacesTest {
    public static void main(String[] args) {
        AdminInteractable testA = new AdminInteractable();
        UserInteractable testU = new UserInteractable();

        System.out.println(testA.interaction());
        System.out.println(testU.interaction());
    }
}
