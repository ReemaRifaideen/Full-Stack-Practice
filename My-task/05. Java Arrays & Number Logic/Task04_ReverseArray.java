// Task 04: Reverse an array (modifies the array in place)
public class Task04_ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Two-pointer approach to swap elements
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }

        System.out.print("\nReversed array:  ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
