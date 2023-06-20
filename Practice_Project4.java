package Assisted_Practice_Projects;

class Car {
    private String brand;
    private String model;
    private int year;

    // Default constructor
    public Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Copy constructor
    public Car(Car otherCar) {
        this.brand = otherCar.brand;
        this.model = otherCar.model;
        this.year = otherCar.year;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

public class Practice_Project4 {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Car car1 = new Car(); // Default constructor
        Car car2 = new Car("Toyota", "Corolla", 2022); // Parameterized constructor
        Car car3 = new Car(car2); // Copy constructor

        // Accessing object properties using getter methods
        System.out.println("Car 1: " + car1.getBrand() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println("Car 2: " + car2.getBrand() + " " + car2.getModel() + " " + car2.getYear());
        System.out.println("Car 3: " + car3.getBrand() + " " + car3.getModel() + " " + car3.getYear());
    }
}
