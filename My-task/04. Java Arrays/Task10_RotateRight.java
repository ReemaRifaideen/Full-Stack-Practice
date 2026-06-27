// Task 10: Rotate an array to the right by one position
public class Task10_RotateRight {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Save the last element, shift all others one step to the right
        int lastElement = numbers[numbers.length - 1];

        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[0] = lastElement;

        System.out.print("\nArray after right rotation: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
