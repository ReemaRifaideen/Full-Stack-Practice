// Task 01: Reverse a given string without using built-in reverse methods
public class Task01_ReverseString {
    public static void main(String[] args) {
        String original = "Hello, Java!";

        // Build reversed string by reading characters from end to start
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}
