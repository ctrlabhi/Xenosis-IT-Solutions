// Shape.java
class Shape {
    // Method to calculate the area (to be overridden)
    public double calculateArea() {
        return 0;
    }
}

// Circle.java
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding method to calculate area of circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle.java
class Rectangle extends Shape {
    private double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding method to calculate area of rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Triangle.java
class Triangle extends Shape {
    private double base, height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding method to calculate area of triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create objects for each shape
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4);

        // Display the areas
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
