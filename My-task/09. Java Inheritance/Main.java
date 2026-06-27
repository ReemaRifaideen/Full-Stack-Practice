// Main.java - Demonstrates Inheritance with Employee, FullTimeEmployee, PartTimeEmployee

public class Main {
    public static void main(String[] args) {

        // Create a FullTimeEmployee object
        // Inherits name and id from Employee; adds monthlySalary
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice Johnson", 101, 75000.00);

        // Create a PartTimeEmployee object
        // Inherits name and id from Employee; adds hoursWorked and hourlyRate
        PartTimeEmployee emp2 = new PartTimeEmployee("Bob Perera", 102, 80, 500.00);

        // Display details of both employees
        System.out.println("\n--- Full-Time Employee Details ---");
        emp1.displayInfo();

        System.out.println("\n--- Part-Time Employee Details ---");
        emp2.displayInfo();
    }
}
