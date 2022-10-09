package Package;

import java.util.Scanner;

import Package.mathematics.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Please enter your name : ");
        // String name = input.nextLine();
        // System.out.println("Your name is " + name);
        // System.out.print("Please enter number : ");
        // int number = input.nextInt();
        // System.out.println("Your number: " + number);

        FourOperations fourOperations = new FourOperations();
        System.out.println("Result FourOperations: " + fourOperations.Addition(10, 20));

        Logarithm logarithm = new Logarithm();
        System.out.println("Result Logarithm: " + logarithm.calculateLog());
    }
}
