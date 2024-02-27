import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numWords = sc.nextInt();

        String[] words = new String[numWords];
        int[] frequencies = new int[numWords];

        for (int i = 0; i < numWords; i++) {
            words[i] = sc.next();
            frequencies[i] = 1;
        }

        for (int i = 0; i < numWords; i++) {
            for (int j = i + 1; j < numWords; j++) {
                if (words[i].equals(words[j])) {
                    frequencies[i]++;
                    frequencies[j] = frequencies[i];
                }
            }
        }

        for (int i = 0; i < numWords; i++) {
            System.out.println(words[i] + " - " + frequencies[i]);
        }
    }
}
