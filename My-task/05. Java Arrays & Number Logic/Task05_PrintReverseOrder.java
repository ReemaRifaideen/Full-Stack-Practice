// Task 05: Print array elements in reverse order (without modifying the array)
public class Task05_PrintReverseOrder {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Original order:  ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nReverse order:   ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
