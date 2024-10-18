public class Person {
    // Attributes of the class
    String name;
    int age;

    // Method to display the attributes
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of Person class
        Person person = new Person();

        // Setting values
        person.name = "John Doe";
        person.age = 25;

        // Displaying the values
        person.displayPersonDetails();
    }
}
