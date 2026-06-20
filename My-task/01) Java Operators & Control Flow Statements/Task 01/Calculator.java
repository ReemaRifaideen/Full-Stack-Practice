// Program to perform addition, subtraction, multiplication, and division of two numbers entered by the user. The program also checks for division by zero to avoid runtime errors.


//import Scanner class from java utility package, take input from the keyboard
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //creates a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //input two numbers from the user
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();


        //perform basic arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;   

        //display the results of the operations
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        //check for division by zero before performing division
        if (number2 != 0) {
            double division = number1 / number2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        //close the Scanner object 
        input.close();
    }
}