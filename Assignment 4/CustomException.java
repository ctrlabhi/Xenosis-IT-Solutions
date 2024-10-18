// CustomException.java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// ExceptionHandlingDemo.java
public class ExceptionHandlingDemo {

    // Method to demonstrate handling ArithmeticException
    public void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    // Method to demonstrate handling NullPointerException
    public void printString(String str) {
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String is null.");
        }
    }

    // Method to demonstrate throwing a custom exception
    public void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be at least 18.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        ExceptionHandlingDemo demo = new ExceptionHandlingDemo();

        // Handling ArithmeticException
        demo.divideNumbers(10, 0);

        // Handling NullPointerException
        demo.printString(null);

        // Handling CustomException
        try {
            demo.validateAge(16);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}
