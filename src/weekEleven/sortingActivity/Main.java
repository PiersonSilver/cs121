package weekEleven.sortingActivity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting test = new Sorting();
        int[] testArray = test.getArray();
        System.out.println(Arrays.toString(testArray));
        int[] sortedArray = test.sortArray(testArray);
        System.out.println(Arrays.toString(sortedArray));
    }
}
