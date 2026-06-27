// Task 05: Find all duplicate characters and their occurrence counts
public class Task05_DuplicateCharCount {
    public static void main(String[] args) {
        String text = "programming"; // Change to test other strings

        System.out.println("String: " + text);
        System.out.println("Duplicate characters and their counts:");

        boolean[] alreadyPrinted = new boolean[text.length()];

        for (int i = 0; i < text.length(); i++) {
            if (alreadyPrinted[i]) {
                continue;
            }

            char current = text.charAt(i);
            int count = 1;

            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    count++;
                    alreadyPrinted[j] = true;
                }
            }

            // Only print characters that appear more than once
            if (count > 1) {
                System.out.println("  '" + current + "' appears " + count + " times");
            }
        }
    }
}
