package weekEleven.sortingActivity;

import java.util.Scanner;

public class Sorting {
    Scanner console = new Scanner(System.in);
    public int[] getArray(){
        int[] ints = new int[5];
        System.out.println("Enter 5 integers: ");
        for(int n = 0; n < ints.length; n++){
            ints[n] = Integer.parseInt(console.nextLine());
        }
        return ints;
    }
    public int[] sortArray(int[] array){
        int temp;
        for(int i = 0; i < array.length - 1; i++){
            for(int index = 0; index < array.length - i - 1; index++){
                if(array[index]>array[index+1]){
                    temp = array[index];
                    array[index] = array[index+1];
                    array[index+1] = temp;
                }
            }
        }
        return array;
    }
}
