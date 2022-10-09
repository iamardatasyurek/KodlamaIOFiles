package Collections.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 3 };
        numbers = new int[4];
        //System.out.println(numbers[0]); // 0

        ArrayList numbers2 = new ArrayList();
        //System.out.println(numbers2.size()); // 0
        numbers2.add(1);
        numbers2.add(2);
        //System.out.println(numbers2.size()); // 2
        numbers2.add("Ankara");
        //System.out.println(numbers2.size()); // 3
        //System.out.println(numbers2.get(2)); // Ankara
        numbers2.set(0, 100);
        //System.out.println(numbers2.get(0)); // 100
        // numbers2.remove(0); // 100 2 Ankara --> 2 Ankara
        //System.out.println(numbers2.get(0)); // 2
        // numbers2.clear();

        for (Object object : numbers2) {
            System.out.println(object); // 100 2 Ankara
        }

    }
}
