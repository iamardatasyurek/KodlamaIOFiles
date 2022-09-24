package Methods2;

public class Main {
    public static void main(String[] args) {
        String message = "Today, weather is so wonderful.";
        String newMessage = message.substring(0, 2);
        System.out.println(newMessage);

        int num1 = 5;
        int num2 = 6;
        int result = addition(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);

        int result2 = addition(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("Result2: " + result2);
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int addition(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

}
