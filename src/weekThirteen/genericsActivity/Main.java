package weekThirteen.genericsActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericMethods test = new GenericMethods();
        ArrayList<Integer>intArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double>doubleArray = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character>charArray = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        ArrayList<String>stringArray = new ArrayList<>(Arrays.asList("Dog", "Cat", "Bird", "Idk"));

        System.out.print("Integer Array: ");
        test.printArrayList(intArray);
        System.out.print("Double Array: ");
        test.printArrayList(doubleArray);
        System.out.print("Char Array: ");
        test.printArrayList(charArray);
        System.out.print("String Array: ");
        test.printArrayList(stringArray);




    }
}
