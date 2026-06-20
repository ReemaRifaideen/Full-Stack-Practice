public class OddNumbers {
    public static void main(String[] args) {

        int i = 1;  // starting point

        while (i <= 50) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

            i++; // next number
        }
    }
}