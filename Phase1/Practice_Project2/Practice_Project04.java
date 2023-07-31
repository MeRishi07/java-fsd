package Assisted_Practice_Projects2;

public class Practice_Project04 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int index = 5;

        try {
            int result = numbers[index];
            System.out.println("The value at index " + index + " is: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } finally {
            System.out.println("This block is always executed.");
        }

        System.out.println("Program continues after the try-catch block.");
    }
}
