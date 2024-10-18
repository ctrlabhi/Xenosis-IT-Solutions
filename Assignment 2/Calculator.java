public class Calculator {
    // Constructor
    public Calculator() {
        System.out.println("Calculator object created!");
    }

    // Overloaded methods for addition
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded methods for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Creating a Calculator object using the constructor
        Calculator calculator = new Calculator();

        // Using overloaded methods for addition
        System.out.println("Addition of integers: " + calculator.add(10, 20));
        System.out.println("Addition of doubles: " + calculator.add(5.5, 4.5));

        // Using overloaded methods for multiplication
        System.out.println("Multiplication of integers: " + calculator.multiply(10, 20));
        System.out.println("Multiplication of doubles: " + calculator.multiply(3.5, 2.5));
    }
}
