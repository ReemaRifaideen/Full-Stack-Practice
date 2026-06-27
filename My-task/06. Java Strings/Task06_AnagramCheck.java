// Task 06: Check whether two strings are anagrams of each other
public class Task06_AnagramCheck {
    public static void main(String[] args) {
        String string1 = "listen"; // Change to test other pairs
        String string2 = "silent";

        // Convert both to lowercase for case-insensitive comparison
        String s1 = string1.toLowerCase();
        String s2 = string2.toLowerCase();

        boolean isAnagram = true;

        // Anagrams must have the same length
        if (s1.length() != s2.length()) {
            isAnagram = false;
        } else {
            // Count character frequencies using an int array (26 letters)
            int[] charCount = new int[26];

            for (int i = 0; i < s1.length(); i++) {
                charCount[s1.charAt(i) - 'a']++;
                charCount[s2.charAt(i) - 'a']--;
            }

            // If all counts are zero, strings are anagrams
            for (int i = 0; i < 26; i++) {
                if (charCount[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);
        if (isAnagram) {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" ARE anagrams.");
        } else {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are NOT anagrams.");
        }
    }
}
