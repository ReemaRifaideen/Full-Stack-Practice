// ============================================================
// Main.java - Entry Point
// Demonstrates all 5 OOP concepts:
//   1. Encapsulation  - Book (private fields + getters/setters)
//   2. Inheritance    - Person → Student, Librarian
//   3. Abstraction    - LibraryItem → Book (displayInfo)
//   4. Polymorphism   - LibraryItem item = new Book()
//   5. Interface      - Borrowable (Student + Book)
// ============================================================

public class Main {
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("       LIBRARY MANAGEMENT SYSTEM             ");
        System.out.println("==============================================");

        // ----------------------------------------------------------
        // 1. ENCAPSULATION — Create Book using setters
        // ----------------------------------------------------------
        System.out.println("\n[1] ENCAPSULATION - Book Details (via Getters/Setters)");
        System.out.println("----------------------------------------------");
        Book book1 = new Book(0, "", "", 0);
        book1.setBookId(101);
        book1.setTitle("Clean Code");
        book1.setAuthor("Robert C. Martin");
        book1.setPrice(1500.00);

        System.out.println("  Book ID : " + book1.getBookId());
        System.out.println("  Title   : " + book1.getTitle());
        System.out.println("  Author  : " + book1.getAuthor());
        System.out.printf( "  Price   : Rs. %.2f%n", book1.getPrice());

        // ----------------------------------------------------------
        // 2. INHERITANCE — Person → Student and Librarian
        // ----------------------------------------------------------
        System.out.println("\n[2] INHERITANCE - Student and Librarian extend Person");
        System.out.println("----------------------------------------------");

        Student student = new Student("Alice Perera", 20, "STU-2024-001");
        System.out.println("  Student Info:");
        student.displayPersonInfo();

        System.out.println();
        Librarian librarian = new Librarian("Mr. John Silva", 45, "EMP-2024-010");
        System.out.println("  Librarian Info:");
        librarian.displayPersonInfo();
        librarian.manageLibrary();

        // ----------------------------------------------------------
        // 3. ABSTRACTION — LibraryItem (abstract class) → Book
        // ----------------------------------------------------------
        System.out.println("\n[3] ABSTRACTION - LibraryItem abstract class");
        System.out.println("----------------------------------------------");
        Book book2 = new Book(102, "Head First Java", "Kathy Sierra", 1200.00);
        System.out.println("  Book details via abstract displayInfo():");
        book2.displayInfo();

        // ----------------------------------------------------------
        // 4. POLYMORPHISM — LibraryItem reference pointing to Book object
        // ----------------------------------------------------------
        System.out.println("\n[4] POLYMORPHISM - LibraryItem item = new Book()");
        System.out.println("----------------------------------------------");
        LibraryItem item = new Book(103, "Effective Java", "Joshua Bloch", 1800.00);
        System.out.println("  Calling item.displayInfo() on a Book object at runtime:");
        item.displayInfo(); // Calls Book's overridden version at runtime

        // ----------------------------------------------------------
        // 5. INTERFACE — Borrowable implemented by Student and Book
        // ----------------------------------------------------------
        System.out.println("\n[5] INTERFACE - Borrowable (Student and Book)");
        System.out.println("----------------------------------------------");
        System.out.println("  Student borrowing/returning:");
        student.borrowItem();
        student.returnItem();

        System.out.println("  Book borrowing/returning:");
        book2.borrowItem();
        book2.returnItem();

        System.out.println("\n==============================================");
        System.out.println("    All OOP Concepts Demonstrated!            ");
        System.out.println("==============================================");
    }
}
