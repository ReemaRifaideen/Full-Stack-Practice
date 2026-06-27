// Task 05: Count the number of even and odd elements in an array
public class Task05_EvenOddCount {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nEven count: " + evenCount);
        System.out.println("Odd count:  " + oddCount);
    }
}
