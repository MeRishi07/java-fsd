package Assisted_Practice_Projects2;

class Shape {
    protected double area;

    public void calculateArea() {
        System.out.println("Calculating the area of the shape.");
    }

    public void displayArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }
}

public class Practice_Project08 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.displayArea();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.calculateArea();
        rectangle.displayArea();
    }
}
