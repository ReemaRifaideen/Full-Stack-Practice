// Java program to calculate grade based on marks 


// Importing Scanner class for user input
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter student marks: ");
        int marks = input.nextInt();

        // Grade calculation 
        if (marks >= 80 && marks <= 100) {
            System.out.println("Grade: A");
        }
        else if (marks >= 70) {
            System.out.println("Grade: B");
        }
        else if (marks >= 60) {
            System.out.println("Grade: C");
        }
        else if (marks >= 50) {
            System.out.println("Grade: D");
        }
        else if (marks >= 0) {
            System.out.println("Grade: F");
        }
        else {
            System.out.println("Invalid marks");
        }

        // Close the scanner
        input.close();
    }
}
