import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      String inputFileName;

      FileInputStream fileStream = null;
      Scanner fileScanner = null;

      inputFileName = scnr.next();

      fileStream = new FileInputStream(inputFileName);
      fileScanner = new Scanner(fileStream);

      while(fileScanner.hasNext()) {
         String newString = fileScanner.next().replace("_photo.jpg", "_info.txt");
         System.out.println(newString);
      }

      fileStream.close();
      fileScanner.close();
      scnr.close();
   }
}
