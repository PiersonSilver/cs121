package weekTen;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayListTest {
    public static void main(String[] args) {
        StringArrayList test = new StringArrayList();
        test.addName("John");
        test.addName("Tim");
        test.addName("Tyler");

        System.out.printf("There are %d names in this list.\n", test.listSize());
        test.displayNames1();

        System.out.printf("\nRemove first element %s\n", test.getName(0));
        test.removeName(0);
        System.out.printf("\nThere are %d names in this list\n", test.listSize());
        test.displayNames2();
    }
}