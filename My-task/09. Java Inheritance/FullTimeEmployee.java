// FullTimeEmployee.java - Child Class 1
// Inherits from Employee and adds monthly salary logic

public class FullTimeEmployee extends Employee {

    // ---------- Additional Field ----------
    double monthlySalary;

    // ---------- Constructor ----------
    // Uses super() to call the parent class constructor for name and id
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // ---------- calculateSalary() ----------
    // Displays the fixed monthly salary of the full-time employee
    public void calculateSalary() {
        System.out.printf("Employment Type : Full-Time%n");
        System.out.printf("Monthly Salary  : Rs. %.2f%n", monthlySalary);
    }

    // ---------- displayInfo() ----------
    // Overrides parent displayInfo() to also show salary details
    @Override
    public void displayInfo() {
        System.out.println("==============================");
        super.displayInfo();   // Call parent method to print name and id
        calculateSalary();
        System.out.println("==============================");
    }
}
