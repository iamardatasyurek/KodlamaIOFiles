package MiniProjects.PrimeNumber;

public class Main {
    public static void main(String[] args) {
        int number = 1;

        int counter = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " ain't a prime");
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.println(number + " is a prime");
        }

        System.out.println("-----------------------------------");

        boolean isPrime = true;
        if (number == 1) {
            System.out.println(number + " ain't a prime");
            return;
        }
        if (number < 1) {
            System.out.println("Invalid number");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " ain't a prime");
        }

    }
}
