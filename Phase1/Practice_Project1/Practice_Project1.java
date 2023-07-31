package Assisted_Practice_Projects;

public class Practice_Project1 {

    public static void main(String[] args) {
        // Implicit type casting (Widening Conversion)
        int num1 = 100;
        long num2 = num1; // Implicit casting from int to long
        System.out.println("Implicit casting: " + num2);

        // Explicit type casting (Narrowing Conversion)
        double num3 = 123.456;
        int num4 = (int) num3; // Explicit casting from double to int
        System.out.println("Explicit casting: " + num4);
    }
}
