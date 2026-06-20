import java.util.Scanner;

public class SumEvenNums {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input n
        System.out.print("Enter a number (n): ");
        int n = input.nextInt();

        int i = 1;
        int sum = 0;

        // Loop from 1 to n
        while (i <= n) {

            if (i % 2 == 0) {
                sum = sum + i;
            }

            i++;
        }

        System.out.println("Sum of even numbers = " + sum);

        input.close();
    }
}
