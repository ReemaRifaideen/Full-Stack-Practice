// This program checks if a student has pass or fail based on their marks.

// Importing Scanner class for user input
import java.util.Scanner;

public class StudentMark {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter student marks: ");
        int marks = input.nextInt();

        // Check pass or fail
        if (marks >= 50) {
            System.out.println("Congratulations YOU ARE PASS. ");
        } else {
            System.out.println("YOU ARE FAIL. ");
        }

        // Close the Scanner object
        input.close();
    }
}
