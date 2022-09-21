package Demos.RecapDemo2;

public class Main {
    public static void main(String[] args) {
        double[] myList = new double[4];
        double[] myList2 = { 1.2, 3.5, 7.5, 4.5 };

        double total = 0;
        double max = myList2[0];
        for (double number : myList2) {
            System.out.println(number);
            total += number;
            if (max < number) {
                max = number;
            }
        }
        System.out.println("Total: " + total);
        System.out.println("Max: " + max);
    }
}
