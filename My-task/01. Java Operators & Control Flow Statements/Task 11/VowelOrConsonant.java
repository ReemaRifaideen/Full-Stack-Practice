// Program to check whether a character is a vowel or consonant


// Importing Scanner class for user input
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input character
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        // Convert to lowercase for checking
        ch = Character.toLowerCase(ch);

        // Check vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Consonant.");
        }
        else {
            System.out.println("Invalid input , not an Alphabet!");
        }
        // Close the scanner
        input.close();
    }
}
