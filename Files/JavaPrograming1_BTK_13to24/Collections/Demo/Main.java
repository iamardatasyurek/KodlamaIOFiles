package Collections.Demo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Mark", "Smith"));
        customers.add(new Customer(2, "Jack", "Jones"));
        customers.add(new Customer(3, "Anna", "Swan"));

        for (Customer customer : customers) {
            System.out.println(customer.id + " " + customer.firstName + " " + customer.lastName);
        }
    }
}
