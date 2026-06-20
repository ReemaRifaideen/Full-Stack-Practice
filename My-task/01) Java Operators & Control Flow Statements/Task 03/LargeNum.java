//This program finds the largest of two numbers entered by the user


//import Scanner class from java utility package, take input from the keyboard
import java.util.Scanner;
public class LargeNum {
    public static void main(String[] args) {
        //creates a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Get the input from user
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();


        //Check which number is the largest using if-else statements
        if(num1 > num2 ) {
            System.out.println(num1 + " is the largest number.");
        } else if(num2 > num1 ) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        //close the Scanner object
        input.close();
    }
}