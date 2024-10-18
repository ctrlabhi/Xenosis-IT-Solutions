
// StudentManager.java
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    // ArrayList to hold the list of students
    private ArrayList<String> students = new ArrayList<>();

    // Method to add a student
    public void addStudent(String studentName) {
        students.add(studentName);
        System.out.println(studentName + " has been added.");
    }

    // Method to remove a student
    public void removeStudent(String studentName) {
        if (students.remove(studentName)) {
            System.out.println(studentName + " has been removed.");
        } else {
            System.out.println(studentName + " not found in the list.");
        }
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("List of students:");
            for (String student : students) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        // Adding some students
        manager.addStudent("John Doe");
        manager.addStudent("Jane Smith");
        manager.addStudent("Alice Johnson");

        // Displaying students
        manager.displayStudents();

        // Removing a student
        System.out.print("Enter a student to remove: ");
        String studentToRemove = sc.nextLine();
        manager.removeStudent(studentToRemove);

        // Displaying the updated list
        manager.displayStudents();

        sc.close();
    }
}
