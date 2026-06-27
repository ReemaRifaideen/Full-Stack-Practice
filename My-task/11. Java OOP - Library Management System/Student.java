// ============================================================
// Student.java - Child Class of Person
// OOP Concepts demonstrated:
//   INHERITANCE  → extends Person
//   INTERFACE    → implements Borrowable
// ============================================================

public class Student extends Person implements Borrowable {

    // Student-specific field
    String studentId;

    // Constructor — calls super() to initialize Person fields
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // ---------- INHERITANCE: Overrides displayPersonInfo() ----------
    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo(); // Reuse parent method
        System.out.println("  Student ID : " + studentId);
        System.out.println("  Role       : Student");
    }

    // ---------- INTERFACE: Implement Borrowable methods ----------
    @Override
    public void borrowItem() {
        System.out.println("  Student \"" + name + "\" borrowed a book.");
    }

    @Override
    public void returnItem() {
        System.out.println("  Student \"" + name + "\" returned a book.");
    }
}
