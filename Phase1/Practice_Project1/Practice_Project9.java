package Assisted_Practice_Projects;

public class Practice_Project9 {

    public static void main(String[] args) {
        // Creating an array
        int[] numbers = new int[5];

        // Initializing array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing array elements
        System.out.println("Array elements:");
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers[2]: " + numbers[2]);
        System.out.println("numbers[3]: " + numbers[3]);
        System.out.println("numbers[4]: " + numbers[4]);

        // Calculating array length
        int length = numbers.length;
        System.out.println("Array length: " + length);

        // Iterating over array elements
        System.out.println("Iterating over array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }
    }
}
