import java.util.Scanner;

public class ScratchWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of words
        int numWords = sc.nextInt();

        // Create arrays to store words and their frequencies
        String[] words = new String[numWords];
        int[] frequencies = new int[numWords];

        // Read and populate the arrays
        for (int i = 0; i < numWords; i++) {
            words[i] = sc.next();
            frequencies[i] = 1; // Initialize frequencies to 1
        }

        // Calculate frequencies
        for (int i = 0; i < numWords; i++) {
            if (frequencies[i] != 0) {
                for (int j = i + 1; j < numWords; j++) {
                    if (words[i].equals(words[j])) {
                        frequencies[i]++;
                        frequencies[j] = 0; // Mark duplicate frequencies as 0
                    }
                }

                // Output the result for the current word
                System.out.println(words[i] + " - " + frequencies[i]);
            }
        }

        // Close the scanner
        sc.close();
    }
}