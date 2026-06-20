import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int reverse = 0;

        // while loop to reverse number
        while (num != 0) {

            int digit = num % 10;          // get last digit
            reverse = reverse * 10 + digit; // build reverse
            num = num / 10;                // remove last digit
        }

        System.out.println("Reversed number = " + reverse);

        // Close the scanner
        input.close();
    }
}