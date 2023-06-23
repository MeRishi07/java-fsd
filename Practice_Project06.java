package Assisted_Practice_Projects2;

public class Practice_Project06 {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println("Accessing element at index 4: " + numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block is executed.");
        }

        divide(10, 0);
    }

    public static void divide(int dividend, int divisor) {
        try {
            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
