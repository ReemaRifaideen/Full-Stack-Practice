// Employee.java - Parent (Base) Class
// This is the base class that holds common attributes shared by all employee types

public class Employee {

    // ---------- Fields ----------
    String name;
    int id;

    // ---------- Constructor ----------
    public Employee(String name, int id) {
        this.name = name;
        this.id   = id;
    }

    // ---------- displayInfo() ----------
    // Displays the common employee information (name and ID)
    public void displayInfo() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
    }
}
