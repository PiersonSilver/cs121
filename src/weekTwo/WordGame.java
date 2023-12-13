package weekTwo;

import javax.swing.JOptionPane;


public class WordGame {
    public static void main(String[] args) {
        //prompts
        String name = JOptionPane.showInputDialog("What's Your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("What's Your Age?"));
        String city = JOptionPane.showInputDialog("What City Do You Live In?");
        String college = JOptionPane.showInputDialog("What College Do You Attend?");
        String major = JOptionPane.showInputDialog("What is Your Major?");
        String animal = JOptionPane.showInputDialog("What's Your Favorite Animal?");
        String petName = JOptionPane.showInputDialog("What's Your Pet's Name?" +
                "\n                     or" +
                "\nWhat Would You Name a Pet?");

        //statement for either "a" or "an" depending on animal
        String aan = "a";
        String afl = String.valueOf(animal.toLowerCase().charAt(0));
        switch (afl) {
            case "a", "e", "i", "o", "u" ->
                aan = "an";

        }

        //random if statement

        //if (age >= 21)
        //    System.out.print("old");
        //else
        //    System.out.print("young");
        //System.out.print("There once was a person named " + name + " who lived in " + city +
        //        ",\nAt the age of " + age + ", " + name + " went to college at " + college +
        //        ".\n" + name + " graduated with a major in " + major + ". Then, " + name + " adopted a(n) \n" +
        //        animal + " named " + petName + ". They both lived happily ever after!");


        JOptionPane.showMessageDialog(null, "There once was a person named " + name + " who lived in " + city +
                ".\nAt the age of " + age + ", " + name + " went to college at " + college +
                ".\n" + name + " graduated with a major in " + major + ".\nThen, " + name + " adopted " + aan + " " +
                animal + " named " + petName + ".\nThey both lived happily ever after!");
    }
}
