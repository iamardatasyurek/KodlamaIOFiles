package ExceptionHandling.TryCatch;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 3 };
        try {
            System.out.println(numbers[10]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Logged : " + e);
        } finally {
            System.out.println("Finally always works.");
        }
    }
}
