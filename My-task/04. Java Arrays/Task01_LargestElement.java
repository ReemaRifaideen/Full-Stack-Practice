// Task 01: Find the largest element in an array
public class Task01_LargestElement {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 89, 23, 56};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nLargest element: " + largest);
    }
}
