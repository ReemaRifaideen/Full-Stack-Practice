import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int i = 1;

        // while loop for table
        while (i <= 15) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

        // Close the scanner
        input.close();
    }
    
}
