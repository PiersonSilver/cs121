package weekThree;

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Is anyone in your party a Vegetarian?");
        String vegetarian = console.nextLine().toLowerCase();
        System.out.print("Is anyone in your party a Vegan?");
        String vegan = console.nextLine().toLowerCase();
        System.out.print("Is anyone in your party Gluten-Free?");
        String gluten = console.nextLine().toLowerCase();

        boolean veg = (vegetarian.equals("yes"))? true: false;
        boolean vega = (vegan.equals("yes"))? true: false;
        boolean gf = (gluten.equals("yes"))? true: false;


        System.out.println("Here are Your Restaurant Choices:");
        if (veg)
            if (vega)
                System.out.println("\tCorner Cafe\n\tThe Chef's Kitchen");
            else
                if (gf)
                    System.out.println("\tMain Street Pizza Company\n\tCorner Cafe\n\tThe Chef's Kitchen");
                else
                    System.out.println("\tMain Street Pizza Company\n\tCorner Cafe\n\tMama's Fine Italian\n\tThe Chef's Kitchen");
        else
            if (vega)
                System.out.println("\tCorner Cafe\n\tThe Chef's Kitchen");
            else
                if (gf)
                    System.out.println("\tMain Street Pizza Company\n\tCorner Cafe\n\tThe Chef's Kitchen");
                else
                    System.out.println("\tJoe's Gourmet Burgers\n\tMain Street Pizza Company\n\tCorner Cafe\n\tMama's Fine Italian\n\tThe Chef's Kitchen");


    }
}
