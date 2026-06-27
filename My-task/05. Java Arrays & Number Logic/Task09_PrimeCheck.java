// Task 09: Check whether a number is Prime
public class Task09_PrimeCheck {
    public static void main(String[] args) {
        int number = 29; // Change this value to test other numbers

        boolean isPrime = true;

        // Numbers less than 2 are not prime
        if (number < 2) {
            isPrime = false;
        } else {
            // Check divisibility from 2 up to square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println("Number: " + number);
        if (isPrime) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }
    }
}
