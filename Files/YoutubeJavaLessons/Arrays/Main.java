package Arrays;

public class Main {
    public static void main(String[] args) {
        String std1 = "Anna";
        String std2 = "Jane";
        String std3 = "Mark";
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);

        String std4 = "Mary";
        System.out.println(std4);

        System.out.println("-----------------------------");

        String[] sutedents = new String[4];
        sutedents[0] = "Anna";
        sutedents[1] = "Jane";
        sutedents[2] = "Mark";
        sutedents[3] = "Mary";

        for (int i = 0; i < sutedents.length; i++) {
            System.out.println(sutedents[i]);
        }

        System.out.println("-----------------------------");

        for (String student : sutedents) {
            System.out.println(student);
        }

    }
}
