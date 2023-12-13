package weekTwelve.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        BinarySearch test = new BinarySearch();
        ArrayList<Integer>array = new ArrayList<>(Arrays.asList(23, 17, 12, 90, 84, 38, 5, 77, 44));
        System.out.print("unsorted: ");
        for (int num : array)
            System.out.print(num + " ");
        System.out.println();
        ArrayList<Integer> sortedArray = selectionSort(array);
        System.out.print("sorted: ");
        for (int num : sortedArray)
            System.out.print(num + " ");
        System.out.println();

        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());
        int found = test.binarySearch(key, sortedArray);
        if (found == -1)
        {
            System.out.println("Item not found.");
        }
        else
        {
            System.out.printf("Item found at index %d, position %d",
                    found, found +1);
        }
    }
    public static ArrayList<Integer> selectionSort(ArrayList<Integer>array)
    {
        for (int i = 0; i < array.size() - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < array.size(); j++)
            {
                if (array.get(j) < array.get(min))
                {
                    min = j;
                }
            }
            int temp = array.get(i);
            array.set(i, array.get(min));
            array.set(min, temp);
        }
        return array;
    }
}

