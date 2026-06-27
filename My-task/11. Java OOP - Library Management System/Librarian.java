// ============================================================
// Librarian.java - Child Class of Person
// OOP Concept: INHERITANCE → extends Person
// ============================================================

public class Librarian extends Person {

    // Librarian-specific field
    String employeeId;

    // Constructor — calls super() to initialize Person fields
    public Librarian(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    // ---------- INHERITANCE: Overrides displayPersonInfo() ----------
    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo(); // Reuse parent method
        System.out.println("  Employee ID : " + employeeId);
        System.out.println("  Role        : Librarian");
    }

    // Librarian-specific action
    public void manageLibrary() {
        System.out.println("  Librarian \"" + name + "\" is managing the library.");
    }
}
