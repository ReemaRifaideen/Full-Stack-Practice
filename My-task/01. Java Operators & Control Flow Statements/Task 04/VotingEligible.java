//This program checks if a person is eligible to vote based on their age


//import Scanner class from java utility package, take input from the keyboard
import java.util.Scanner;

public class VotingEligible {
    public static void main(String[] args){
        //creates a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Get the input from user
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        //Check if the age is 18 or above 
        if(age >=18){
            System.out.println("You are Eligible for vote!!!");
        }
        else {
            System.out.println("Sorry ,You are not Eligible to vote.");
        }

        //close the Scanner object
        input.close();
    }

}
