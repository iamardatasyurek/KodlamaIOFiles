package MiniProjects.PerfectNumber;

public class Main {
    public static void main(String[] args) {
        int number = 29;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " ain't a perfect number.");
        }
    }
}
