class Vehicle {
    // Method to be overridden
    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

// Car.java
class Car extends Vehicle {
    // Method overriding
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

// Bike.java
class Bike extends Vehicle {
    // Method overriding
    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Polymorphism: Vehicle reference, Car and Bike objects
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();

        // Calling the overridden methods
        vehicle1.startEngine(); // Output: Car engine started.
        vehicle2.startEngine(); // Output: Bike engine started.
    }
}
