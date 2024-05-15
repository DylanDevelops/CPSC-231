import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScratchWork {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream("test.txt");
        Scanner scnr = new Scanner(stream);

        while(scnr.hasNextLine()) {
            System.out.println(scnr.nextLine());
        }
    }
}
