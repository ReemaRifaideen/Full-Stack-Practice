// PartTimeEmployee.java - Child Class 2
// Inherits from Employee and calculates salary based on hours worked x hourly rate

public class PartTimeEmployee extends Employee {

    // ---------- Additional Fields ----------
    int    hoursWorked;
    double hourlyRate;

    // ---------- Constructor ----------
    // Uses super() to call the parent class constructor for name and id
    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate  = hourlyRate;
    }

    // ---------- calculateSalary() ----------
    // Calculates total salary: hoursWorked x hourlyRate
    public void calculateSalary() {
        double totalSalary = hoursWorked * hourlyRate;
        System.out.println("Employment Type : Part-Time");
        System.out.println("Hours Worked    : " + hoursWorked);
        System.out.printf( "Hourly Rate     : Rs. %.2f%n", hourlyRate);
        System.out.printf( "Total Salary    : Rs. %.2f%n", totalSalary);
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
