// This program uses a switch statement to determine the day of the week based on a number input by the user.


// Importing Scanner class for user input
import java.util.Scanner;

public class SwitchDay {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Input day number
        System.out.print("Enter day number (1-7): ");
        int day = input.nextInt();

        // Switch statement
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("INVALID day number");
        }

        // Close the Scanner object
        input.close();
    }
}
