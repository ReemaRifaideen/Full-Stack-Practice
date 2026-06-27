// Task 03: Count even and odd numbers in an array
public class Task03_EvenOddCount {
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

        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nEven numbers count: " + evenCount);
        System.out.println("Odd numbers count:  " + oddCount);
    }
}
