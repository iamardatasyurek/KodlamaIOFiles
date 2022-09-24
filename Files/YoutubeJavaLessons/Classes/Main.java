package Classes;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println("number2: " + number2); // 10
        System.out.println("number1: " + number1); // 30

        int[] numbers1 = new int[] { 1, 2, 3 };
        int[] numbers2 = new int[] { 4, 5, 6 };
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println("numbers2[0]: " + numbers2[0]); // 10
        System.out.println("numbers1[0]: " + numbers1[0]); // 10

        String str1 = "Star Wars";
        String str2 = "The Lord of The Rings";
        str2 = str1;
        str1 = "Harry Potter";
        System.out.println("Str2: " + str2); // Star Wars
        System.out.println("Str1: " + str1); // Harry Potter

    }
}
