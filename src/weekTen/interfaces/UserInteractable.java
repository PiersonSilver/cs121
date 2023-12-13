package weekTen.interfaces;

public class UserInteractable implements Interactable{
    public String interaction() {
        int likes = (int)(Math.random()*10000);
        int comments = (int)(Math.random()*100);
        int shares = (int)(Math.random()*1000);
        return String.format("Your Post has %d Likes, %d Comments, and %d Shares", likes, comments, shares);
    }
}
