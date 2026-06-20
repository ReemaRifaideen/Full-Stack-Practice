// This program checks if a number is divisible by both 3 and 5


// Importing Scanner class for user input
import java.util.Scanner;
public class DivBy3and5 {
    public static void main(String[] args) {
        // Creating Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5");
        }
        else {
            System.out.println(number + " is not divisible by both 3 and 5");
        }

        // Closing the Scanner object
        input.close();
    }
}
