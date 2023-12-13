package weekThirteen.linkedListActivity;

import java.util.LinkedList;

public class SocialMediaUser {
    private String UserName, Email, Bio, phoneNumber;
    private LinkedList<String>messageList;

    SocialMediaUser(String username, String email, String phonenumber, String bio, LinkedList<String> messagelist){
        this.UserName = username;
        this.Email = email;
        this.phoneNumber = phonenumber;
        this.Bio = bio;
        this.messageList = messagelist;
    }
    public void addMessage(String message){
        messageList.add(message);
    }
    public void removeMessage(int i){
        messageList.remove(i);
    }
    public String getUserInfo(){
        return String.format("Username: %s\nEmail: %s\nPhone Number: %s\nBio: %s", UserName, Email, phoneNumber, Bio);
    }
    public void displayUserMessage(){
        System.out.printf("Messages: %s\n", messageList);
    }
}
