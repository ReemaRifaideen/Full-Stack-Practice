import java.util.Scanner;

public class MenuCalc {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {

            // Display menu
            System.out.println("\nCalculator Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    double num2 = input.nextDouble();

                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();

                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();

                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();

                    if (num2 != 0)
                        System.out.println("Result = " + (num1 / num2));
                    else
                        System.out.println("Cannot divide by zero");

                    break;

                case 5:
                    System.out.println("Program ended");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        // Close the scanner 
        input.close();
    }
}
