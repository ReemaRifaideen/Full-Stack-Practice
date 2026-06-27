// Task 07: Find duplicate elements in an array
public class Task07_FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 3, 9, 5, 1, 8, 2, 1};

        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nDuplicate elements found:");

        boolean foundAny = false;

        // Compare each element with all elements after it
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("  -> " + numbers[i] + " is a duplicate");
                    foundAny = true;
                    break; // Avoid printing same duplicate multiple times
                }
            }
        }

        if (!foundAny) {
            System.out.println("  No duplicates found.");
        }
    }
}
