import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = 0;

        // Handle special case for 0
        if (num == 0) {
            count = 1;
        } else {

            // Make number positive (optional safety)
            if (num < 0) {
                num = -num;
            }

            // Count digits
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);

        // Close the scanner
        input.close();
    }
}
