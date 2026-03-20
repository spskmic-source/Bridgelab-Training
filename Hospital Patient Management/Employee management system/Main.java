// Interface
interface Department {
    void assignDepartment(String deptName);
    void getDepartmentDetails();
}

// Abstract Class
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    protected String department;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("----------------------");
    }

    // Interface methods
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // fixed salary
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, 0);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Polymorphism (Employee reference)
        Employee e1 = new FullTimeEmployee(1, "Rahul", 50000);
        Employee e2 = new PartTimeEmployee(2, "Aman", 500, 20);

        // Assign departments
        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        // Store in array
        Employee[] employees = {e1, e2};

        // Loop and display
        for (Employee emp : employees) {
            emp.displayDetails(); // polymorphism in action
        }
    }
}