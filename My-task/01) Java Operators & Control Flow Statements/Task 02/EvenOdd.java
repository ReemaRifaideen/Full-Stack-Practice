//This program checks if a number is even or odd


//import Scanner class from java utility package, take input from the keyboard
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //creates a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Get the input from user
        System.out.print("Enter a number: ");
        //Reads an integer from the user and stores it in the variable 'number'
        int number = input.nextInt();

        //Check if the number is even or odd using modulus operator
        if(number %2 == 0) {
            System.out.println(number + " is an EVEN NUMBER.");
        } else {
            System.out.println(number + " is an ODD NUMBER.");
        }

        //close the Scanner object
        input.close();
    }
}
