// Task 07: Reverse an array without using built-in methods
public class Task07_ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Swap elements from both ends moving toward the center
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }

        System.out.print("\nReversed array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
