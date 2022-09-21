package MiniProjects.FindNumber;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int desiredNumber = 5;
        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == desiredNumber) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println(desiredNumber + " is exist");
        } else {
            System.out.println(desiredNumber + " isn't exist");

        }
    }
}
