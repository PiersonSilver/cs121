package weekEleven.bigOActivity;

public class BigO {
    public void printOnce(String input) {
        System.out.println("\u001B[36m" + input);
    }

    public void printNTimes(int n) {
        int num = 33;
        for (int i = 0; i < n; i++) {
            System.out.println("\u001B[35mThis will be Printed n Times");
        }
    }

    public void printNSquaredTimes(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.println("\u001B[42m\u001B[30mChristmas Loop\u001B[0m");
                } else {
                    System.out.println("\u001B[41m\u001B[30mChristmas Loop\u001B[0m");
                }
            }
        }
    }
}

