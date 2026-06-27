// Task 07: Remove duplicate characters from a string while preserving order
public class Task07_RemoveDuplicateChars {
    public static void main(String[] args) {
        String original = "programming"; // Change to test other strings

        String result = "";

        for (int i = 0; i < original.length(); i++) {
            char current = original.charAt(i);
            boolean alreadySeen = false;

            // Check if this character was already added to result
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    alreadySeen = true;
                    break;
                }
            }

            if (!alreadySeen) {
                result = result + current;
            }
        }

        System.out.println("Original string: " + original);
        System.out.println("After removing duplicates: " + result);
    }
}
