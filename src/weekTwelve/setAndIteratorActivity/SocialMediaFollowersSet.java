package weekTwelve.setAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SocialMediaFollowersSet {
    Scanner console = new Scanner(System.in);
    Set<String> followers = new HashSet<>();
    public void addFollowers(){
        System.out.println("Add Follower:\nEnter Follower Username (or enter '0' to quit):");
        String input = console.nextLine();
        while(!input.equals("0")){
            followers.add(input);
            System.out.println("Add Follower:\nEnter Follower Username (or enter '0' to quit):");
            input = console.nextLine();
        }
    }
    public void displayFollowers(){
        Iterator<String> iter = followers.iterator();
        System.out.println("\nFollowers:");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
