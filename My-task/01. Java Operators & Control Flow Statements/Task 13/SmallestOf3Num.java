// This program finds the smallest of three numbers entered by the user.

// Importing Scanner class for user input
import java.util.Scanner;

public class SmallestOf3Num {
    public static void main(String[] args) {
        // Creating Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        // Find smallest number
        if (num1 < num2 && num1 < num3) {
            System.out.println("Smallest number is " + num1);
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println("Smallest number is " + num2);
        }
        else {
            System.out.println("Smallest number is " + num3);
        }

        // Closing the Scanner object
        input.close();
    }
}
