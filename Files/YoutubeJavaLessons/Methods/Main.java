package Methods;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int desiredNumber = 5;
        findNumberInArray(numbers, desiredNumber);

    }

    public static void findNumberInArray(int[] array, int desiredNumber) {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == desiredNumber) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            giveMessage(desiredNumber + " is exist");
        } else {
            giveMessage(desiredNumber + " isn't exist");
        }
    }

    public static void giveMessage(String message) {
        System.out.println(message);
    }
}
