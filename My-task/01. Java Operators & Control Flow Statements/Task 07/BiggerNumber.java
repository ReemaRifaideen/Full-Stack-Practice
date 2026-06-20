// This program takes two numbers as input and finds the bigger number using if-else statements.


// Import the Scanner class to take input from the user
import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Find bigger number using if-else
        if (number1 > number2) {
            System.out.println("Bigger number is: " + number1);
        } else {
            System.out.println("Bigger number is: " + number2);
        }

        input.close();
    }
}