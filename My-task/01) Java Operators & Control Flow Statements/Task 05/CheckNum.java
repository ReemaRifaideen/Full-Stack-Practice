//This program checks if a number is positive, negative or zero

//import Scanner class from java utility package, take input from the keyboard
import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        //creates a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Get the input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //Check if the number is positive, negative or zero 
        if(number > 0){
            System.out.println(number + " is a positive number.");
        }
        else if(number < 0){
            System.out.println(number + " is a negative number.");
        }
        else {
            System.out.println("The number is zero.");
        }

        //close the Scanner object
        input.close();
    }
}
