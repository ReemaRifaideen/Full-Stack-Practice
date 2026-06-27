// Task 08: Remove duplicate elements from an array
public class Task08_RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 3, 9, 5, 1, 8, 2, 1};

        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Store unique elements in a temporary array
        int[] uniqueNumbers = new int[numbers.length];
        int uniqueCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == uniqueNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueNumbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.print("\nArray after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
        System.out.println();
    }
}
