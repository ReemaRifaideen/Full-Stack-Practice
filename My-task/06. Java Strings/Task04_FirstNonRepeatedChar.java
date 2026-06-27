// Task 04: Find the first non-repeated character in a string
public class Task04_FirstNonRepeatedChar {
    public static void main(String[] args) {
        String text = "swiss"; // Change to test other strings

        char firstUnique = 0;
        boolean found = false;

        // For each character, check if it appears more than once
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < text.length(); j++) {
                if (i != j && text.charAt(j) == current) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                firstUnique = current;
                found = true;
                break;
            }
        }

        System.out.println("String: " + text);
        if (found) {
            System.out.println("First non-repeated character: '" + firstUnique + "'");
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
