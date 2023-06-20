package Assisted_Practice_Projects;

public class Practice_Project3 {

    // Method with no return value and no parameters
    public void greet() {
        System.out.println("Hello!");
    }

    // Method with return value and parameters
    public int sum(int a, int b) {
        return a + b;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
    	Practice_Project3 obj = new Practice_Project3();

        // Calling a method with no return value and no parameters
        obj.greet();

        // Calling a method with return value and parameters
        int result = obj.sum(5, 3);
        System.out.println("Sum: " + result);

        // Calling a static method
        staticMethod();

        // Calling a static method using the class name
        Practice_Project3.staticMethod();

        // Creating an anonymous object and calling a method
        new Practice_Project3().greet();
    }
}
