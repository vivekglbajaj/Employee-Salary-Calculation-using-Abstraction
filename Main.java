// Abstract Class: Employee
abstract class Employee {
    protected String name;
    protected int empId;

    // Constructor
    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Abstract Method to be implemented by subclasses
    public abstract double calculateSalary();

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + calculateSalary());
    }
}

// Concrete Class: FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, int empId, double monthlySalary) {
        super(name, empId);
        this.monthlySalary = monthlySalary;
    }

    // Implement calculateSalary() for full-time employee
    @Override
    public double calculateSalary() {
        return monthlySalary; // Fixed monthly salary
    }
}

// Concrete Class: PartTimeEmployee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    // Constructor
    public PartTimeEmployee(String name, int empId, int hoursWorked, double hourlyRate) {
        super(name, empId);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Implement calculateSalary() for part-time employee
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate; // Salary depends on hours worked
    }
}

// Main Class to test
public class Main {
    public static void main(String[] args) {
        // Creating a Full-Time Employee
        FullTimeEmployee ftEmp = new FullTimeEmployee("John Doe", 101, 50000);
        System.out.println("=== Full-Time Employee Details ===");
        ftEmp.displayDetails();

        // Creating a Part-Time Employee
        PartTimeEmployee ptEmp = new PartTimeEmployee("Jane Smith", 102, 40, 500);
        System.out.println("\n=== Part-Time Employee Details ===");
        ptEmp.displayDetails();
    }
}
