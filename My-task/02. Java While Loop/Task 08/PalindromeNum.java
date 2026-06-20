import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int original = num;
        int reverse = 0;

        // while loop to reverse number
        while (num != 0) {

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        // check palindrome
        if (original == reverse) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is not a Palindrome number");
        }

        // Close the scanner 
        input.close();
    }
}
