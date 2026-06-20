import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int fact = 1;
        int i = num;

        // while loop for factorial
        while (i >= 1) {
            fact = fact * i;
            i--;
        }

        System.out.println("Factorial = " + fact);

        // Close the scanner 
        input.close();
    }
}
