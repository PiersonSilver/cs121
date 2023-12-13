package weekThirteen.linkedListActivity;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> mL1 = new LinkedList<>();
        LinkedList<String> mL2 = new LinkedList<>();

        SocialMediaUser test1 = new SocialMediaUser("test1", "test1@gmail.com", "951-297-1275", "this is a bio for a test", mL1);
        SocialMediaUser test2 = new SocialMediaUser("test2", "test2@yahoo.com", "850-426-2021", "this bio is for a test 2 thing", mL2);

        test1.addMessage("Hello");
        test1.addMessage("mf ain't responding");
        test1.addMessage("this is the 3rd message");
        test1.addMessage("I give up");

        System.out.println("First Instance:");
        System.out.println(test1.getUserInfo());
        System.out.println();
        test1.displayUserMessage();

        System.out.println();

        test1.removeMessage(2);
        test1.displayUserMessage();

        System.out.println();
        System.out.println("Second Instance:");

        test2.addMessage("Test 2's first message");
        test2.addMessage("Test 2's message after the first (2nd)");
        test2.addMessage("this is the 3rd message");
        test2.addMessage("Test 2 can't count (yahoo user)");

        System.out.println(test2.getUserInfo());
        System.out.println();
        test2.displayUserMessage();

        System.out.println();

        test2.removeMessage(1);
        test2.displayUserMessage();
    }
}
