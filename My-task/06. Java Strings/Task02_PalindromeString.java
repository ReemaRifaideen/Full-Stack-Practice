// Task 02: Check whether a string is a palindrome
public class Task02_PalindromeString {
    public static void main(String[] args) {
        String original = "madam"; // Change to test other strings

        // Convert to lowercase to handle case-insensitive comparison
        String lowerCase = original.toLowerCase();
        boolean isPalindrome = true;

        int left = 0;
        int right = lowerCase.length() - 1;

        // Compare characters from both ends moving inward
        while (left < right) {
            if (lowerCase.charAt(left) != lowerCase.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("String: " + original);
        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + original + "\" is NOT a Palindrome.");
        }
    }
}
