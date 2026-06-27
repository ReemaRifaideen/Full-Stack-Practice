// Task 03: Count vowels, consonants, digits, and special characters in a string
public class Task03_CountCharTypes {
    public static void main(String[] args) {
        String text = "Hello World! Java123";

        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                // Skip spaces (not counted as special here)
                continue;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // Check if letter is a vowel or consonant
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else {
                specialCount++;
            }
        }

        System.out.println("String: " + text);
        System.out.println("-----------------------------");
        System.out.println("Vowels:            " + vowelCount);
        System.out.println("Consonants:        " + consonantCount);
        System.out.println("Digits:            " + digitCount);
        System.out.println("Special characters:" + specialCount);
    }
}
