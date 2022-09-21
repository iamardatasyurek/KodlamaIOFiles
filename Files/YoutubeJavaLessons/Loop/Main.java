package Loop;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Loop fineshed");

        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Loop fineshed");

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Loop fineshed");

        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Loop fineshed");

    }
}
