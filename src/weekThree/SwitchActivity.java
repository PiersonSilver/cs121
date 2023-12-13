package weekThree;

import javax.swing.JOptionPane;

public class SwitchActivity {
    public static void main(String[] args) {
        String season = JOptionPane.showInputDialog("Pick a Season").toLowerCase();
        if (season.equals("autumn"))
            season = "fall";

        switch(season){
            case "summer":
                System.out.println("It is Hot in the Summer");
                break;
            case "spring":
                System.out.println("Spring is when People with Allergies Suffer");
                break;
            case "fall":
                System.out.println("In Fall, the leaves FALL");
                break;
            case "winter":
                System.out.println("It be snowing in the Winter");
                break;
            default:
                System.out.println("That is not a season...");
                break;

        }
}}
