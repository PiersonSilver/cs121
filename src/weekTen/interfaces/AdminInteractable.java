package weekTen.interfaces;

public class AdminInteractable implements Interactable {
    public String interaction() {
        int users = (int)(Math.random()*10000000);
        return String.format("There are %d Active Users", users);
    }
}
