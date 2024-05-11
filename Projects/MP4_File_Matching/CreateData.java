/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP4: File Matching
**/

import java.io.FileWriter;
import java.io.IOException;

public class CreateData {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter transactioNWriter = new FileWriter("Transaction.txt");

            transactioNWriter.write(100 + " " + 27.14 + "\n" + 300 + " " + 62.11 + "\n" + 400 + " " + 100.56 + "\n" + 900 + " " + 82.17); 
            transactioNWriter.close();
            System.out.println("Created Transaction.txt file with dummy data.");

            FileWriter writeMaster = new FileWriter("OldMaster.txt");
            writeMaster.write(100 + " Alan Jones " + 348.17 + "\n" + 300 + " Mary Smith " + 27.19 + "\n" + 500 + " Sam Sharp " + 0.00 + "\n" + 700 + " Suzy Green " + -14.22);
            writeMaster.close();
            System.out.println("Created OldMaster.txt file with dummy data.");

            FileMatch fileMatch = new FileMatch();
            fileMatch.compareFiles();
            System.out.println("Compared files and created NewMaster.txt and TransactionLog.txt.");
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
