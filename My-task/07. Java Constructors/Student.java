// Student.java - Student class with Default, Parameterized, and Copy Constructors

public class Student {

    // ---------- Attributes ----------
    int studentId;
    String studentName;
    String course;

    // ---------- 1. Default Constructor ----------
    // Initializes attributes with default placeholder values
    public Student() {
        studentId   = 0;
        studentName = "Unknown";
        course      = "Not Assigned";
    }

    // ---------- 2. Parameterized Constructor ----------
    // Initializes attributes with values provided by the caller
    public Student(int studentId, String studentName, String course) {
        this.studentId   = studentId;
        this.studentName = studentName;
        this.course      = course;
    }

    // ---------- 3. Copy Constructor ----------
    // Creates a new Student object by copying values from an existing Student object
    public Student(Student otherStudent) {
        this.studentId   = otherStudent.studentId;
        this.studentName = otherStudent.studentName;
        this.course      = otherStudent.course;
    }

    // ---------- Method: displayDetails() ----------
    // Prints all student information in a formatted layout
    public void displayDetails() {
        System.out.println("-----------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("-----------------------------");
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {

        // 1. Create a student using the Default Constructor
        Student student1 = new Student();
        System.out.println("\nStudent 1 (Default Constructor):");
        student1.displayDetails();

        // 2. Create a student using the Parameterized Constructor
        Student student2 = new Student(101, "Alice Johnson", "Software Engineering");
        System.out.println("\nStudent 2 (Parameterized Constructor):");
        student2.displayDetails();

        // 3. Create a student using the Copy Constructor (copies student2's data)
        Student student3 = new Student(student2);
        System.out.println("\nStudent 3 (Copy Constructor - copied from Student 2):");
        student3.displayDetails();
    }
}
