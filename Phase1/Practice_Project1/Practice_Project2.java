package Assisted_Practice_Projects;

// Parent class with different access modifiers
class Parent {
    public String publicVariable = "Public variable";
    protected String protectedVariable = "Protected variable";
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    public void childMethod() {
        System.out.println("This is a method in the Child class.");

        // Accessing parent class members
        System.out.println("Accessing parent class members from child class:");
        System.out.println(publicVariable);     // Public variable
        System.out.println(protectedVariable);  // Protected variable
        // System.out.println(privateVariable); // Cannot access private variable directly

        publicMethod();     // This is a public method.
        protectedMethod();  // This is a protected method.
        // privateMethod();  // Cannot access private method directly
    }
}

public class Practice_Project2 {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.childMethod();
    }
}
