package MethodOverloading;

public class Main {
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        System.out.println("Result: " + fourOperations.Addition(2, 3));
        System.out.println("Result: " + fourOperations.Addition(2, 3, 4));
    }
}
