// Task 02: Find the smallest element in an array
public class Task02_SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 89, 23, 56};

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSmallest element: " + smallest);
    }
}
