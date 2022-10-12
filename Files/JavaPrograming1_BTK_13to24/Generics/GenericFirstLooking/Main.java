package Generics.GenericFirstLooking;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("İzmir");

        MyList<String> cities2 = new MyList<String>();
        cities2.add("New York");
        cities2.add("London");

        MyList<Customer> customers = new MyList<Customer>();
        customers.add(new Customer());
        customers.add(new Customer());
    }
}
