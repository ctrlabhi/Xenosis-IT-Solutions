
// EmployeeManager.java
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManager {
    // HashMap to store employee details
    private HashMap<Integer, String> employeeMap = new HashMap<>();

    // Method to add employee details
    public void addEmployee(int id, String name) {
        employeeMap.put(id, name);
        System.out.println("Employee " + name + " added with ID: " + id);
    }

    // Method to retrieve employee details by ID
    public void getEmployee(int id) {
        String employeeName = employeeMap.get(id);
        if (employeeName != null) {
            System.out.println("Employee ID: " + id + ", Name: " + employeeName);
        } else {
            System.out.println("Employee not found with ID: " + id);
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        // Adding employees
        manager.addEmployee(101, "John Doe");
        manager.addEmployee(102, "Jane Smith");
        manager.addEmployee(103, "Alice Johnson");

        // Retrieving employee details
        System.out.print("Enter employee ID to retrieve details: ");
        int employeeId = sc.nextInt();
        manager.getEmployee(employeeId);

        sc.close();
    }
}
