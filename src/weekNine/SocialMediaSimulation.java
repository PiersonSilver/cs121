package weekNine;

import javax.swing.*;

public class SocialMediaSimulation {
    public static void main(String[] args) {
        int totalPosts = 2;
        String[] postContent = new String[totalPosts];
        int[] postLikes = new int[totalPosts];
        int[] postComments = new int[totalPosts];

        String[][] posts = new String[totalPosts][];


        //initial populate
        for(int i = 0; i < totalPosts; i++){
            postContent[i] = JOptionPane.showInputDialog("Post " + (i+1) + " Content");
            postLikes[i] = Integer.parseInt(JOptionPane.showInputDialog("Post " + (i+1) + " Likes"));
            postComments[i] = Integer.parseInt(JOptionPane.showInputDialog("Post " + (i+1) + " Comments"));
        }


        for(int i = 0; i < totalPosts; i++){
            posts[i] = new String[]{postContent[i], String.valueOf(postLikes[i]), String.valueOf(postComments[i])};
        }

        //initial print
        System.out.printf("%-18s %-11s %4s\n", "Post Content", "Likes", "Comments");
        for (String[] f: posts) {
            System.out.printf("%-16s %2s %12s\n", f[0], f[1], f[2]);
        }

        System.out.println("\nUpdate\n");

        //update populate
        for(int i = 0; i < totalPosts; i++){
            postLikes[i] += Integer.parseInt(JOptionPane.showInputDialog("How Many More Likes did Post " + (i+1) + " get?"));
            postComments[i] += Integer.parseInt(JOptionPane.showInputDialog("How Many More Comments did Post " + (i+1) + " get?"));
        }

        //update populated
        for(int i = 0; i < totalPosts; i++){
            posts[i][1] = String.valueOf(postLikes[i]);
            posts[i][2] = String.valueOf(postComments[i]);
        }

        //updated print
        System.out.printf("%-18s %-11s %4s\n", "Post Content", "Likes", "Comments");
        for (String[] f: posts) {
            System.out.printf("%-16s %2s %12s\n", f[0], f[1], f[2]);
        }
    }
}
