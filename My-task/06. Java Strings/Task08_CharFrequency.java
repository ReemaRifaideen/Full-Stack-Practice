// Task 08: Count the frequency of each character in a string
public class Task08_CharFrequency {
    public static void main(String[] args) {
        String text = "hello world"; // Change to test other strings

        System.out.println("String: \"" + text + "\"");
        System.out.println("Character frequencies:");

        boolean[] alreadyCounted = new boolean[text.length()];

        for (int i = 0; i < text.length(); i++) {
            if (alreadyCounted[i]) {
                continue;
            }

            char current = text.charAt(i);
            int count = 1;

            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    count++;
                    alreadyCounted[j] = true;
                }
            }

            if (current == ' ') {
                System.out.println("  ' ' (space) -> " + count);
            } else {
                System.out.println("  '" + current + "' -> " + count);
            }
        }
    }
}
