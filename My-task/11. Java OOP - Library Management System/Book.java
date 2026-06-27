// ============================================================
// Book.java - Concrete Class
// OOP Concepts demonstrated:
//   ENCAPSULATION  → private fields + getters/setters
//   ABSTRACTION    → extends LibraryItem, overrides displayInfo()
//   INTERFACE      → implements Borrowable
// ============================================================

public class Book extends LibraryItem implements Borrowable {

    // ---------- ENCAPSULATION: Private Attributes ----------
    private int    bookId;
    private String title;
    private String author;
    private double price;

    // ---------- Constructor ----------
    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title  = title;
        this.author = author;
        this.price  = price;
    }

    // ---------- Getters ----------
    public int    getBookId() { return bookId; }
    public String getTitle()  { return title;  }
    public String getAuthor() { return author; }
    public double getPrice()  { return price;  }

    // ---------- Setters ----------
    public void setBookId(int bookId)    { this.bookId = bookId; }
    public void setTitle(String title)   { this.title  = title;  }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price)   { this.price  = price;  }

    // ---------- ABSTRACTION: Override displayInfo() from LibraryItem ----------
    @Override
    public void displayInfo() {
        System.out.println("  Book ID  : " + bookId);
        System.out.println("  Title    : " + title);
        System.out.println("  Author   : " + author);
        System.out.printf( "  Price    : Rs. %.2f%n", price);
    }

    // ---------- INTERFACE: Implement Borrowable methods ----------
    @Override
    public void borrowItem() {
        System.out.println("  Book \"" + title + "\" has been borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println("  Book \"" + title + "\" has been returned.");
    }
}
