package weekThirteen.genericsActivity;

import java.util.ArrayList;

public class GenericMethods {
    public <E> void printArrayList(ArrayList<E> input) {
        for (E element : input) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
