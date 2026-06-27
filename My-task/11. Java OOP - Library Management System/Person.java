// ============================================================
// Person.java - Base Class
// OOP Concept: INHERITANCE
// Holds common attributes shared by all persons in the system.
// Student and Librarian both extend this class.
// ============================================================

public class Person {

    // Common fields for all persons
    String name;
    int    age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    // Method to display common person details
    public void displayPersonInfo() {
        System.out.println("  Name : " + name);
        System.out.println("  Age  : " + age);
    }
}
