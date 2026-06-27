// Task 06: Search for a specific element in an array
public class Task06_SearchElement {
    public static void main(String[] args) {
        int[] numbers = {15, 32, 47, 68, 91, 24, 55};
        int target = 68;

        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSearching for: " + target);

        if (foundIndex != -1) {
            System.out.println("Element " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
