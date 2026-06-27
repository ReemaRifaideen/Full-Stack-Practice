// Task 08: Find the second largest element in an array
public class Task08_SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 89, 23, 56};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nLargest element:        " + largest);
        System.out.println("Second largest element: " + secondLargest);
    }
}
