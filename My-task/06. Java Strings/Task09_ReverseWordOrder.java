// Task 09: Reverse the order of words in a sentence without reversing the words themselves
public class Task09_ReverseWordOrder {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";

        // Split the sentence into individual words using space as delimiter
        String[] words = sentence.split(" ");

        String reversed = "";

        // Build new sentence by adding words from last to first
        for (int i = words.length - 1; i >= 0; i--) {
            reversed = reversed + words[i];
            if (i != 0) {
                reversed = reversed + " ";
            }
        }

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed word order: " + reversed);
    }
}
