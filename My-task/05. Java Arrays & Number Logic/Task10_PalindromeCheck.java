// Task 10: Check whether a number is a Palindrome
public class Task10_PalindromeCheck {
    public static void main(String[] args) {
        int number = 1221; // Change this value to test other numbers

        int originalNumber = number;
        int reversedNumber = 0;
        int temp = number;

        // Reverse the digits of the number
        while (temp != 0) {
            int lastDigit = temp % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            temp = temp / 10;
        }

        System.out.println("Number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome number.");
        } else {
            System.out.println(originalNumber + " is NOT a Palindrome number.");
        }
    }
}
