// Animal.java
abstract class Animal {
    // Abstract method
    public abstract void sound();

    // Non-abstract method
    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

// Dog.java
class Dog extends Animal {
    // Implementation of the abstract method
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Abstract class cannot be instantiated, so we create Dog object
        Animal dog = new Dog();
        dog.sound(); // Output: Dog barks.
        dog.sleep(); // Output: Animal is sleeping.
    }
}
