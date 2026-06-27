// Task 11: Check whether a number is an Armstrong number (using while loop)
// Armstrong number: sum of each digit raised to the power of total digits equals the number
// Example: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
public class Task11_ArmstrongCheck {
    public static void main(String[] args) {
        int number = 153; // Change this value to test other numbers

        int originalNumber = number;
        int digitCount = 0;
        int temp = number;

        // Step 1: Count the number of digits using while loop
        while (temp != 0) {
            digitCount++;
            temp = temp / 10;
        }

        // Step 2: Calculate the sum of digits each raised to power of digitCount
        int sumOfPowers = 0;
        temp = number;

        while (temp != 0) {
            int digit = temp % 10;

            // Calculate digit^digitCount manually (without Math.pow)
            int power = 1;
            for (int i = 0; i < digitCount; i++) {
                power *= digit;
            }

            sumOfPowers += power;
            temp = temp / 10;
        }

        System.out.println("Number: " + originalNumber);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits raised to power " + digitCount + ": " + sumOfPowers);

        if (originalNumber == sumOfPowers) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }
    }
}
