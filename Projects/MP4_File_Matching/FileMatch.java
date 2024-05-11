/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP4: File Matching
**/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileMatch {
    LinkedList<Account> accountList = new LinkedList<Account>();
    LinkedList<TransactionRecord> transactionRecords = new LinkedList<TransactionRecord>();

    public FileMatch() throws FileNotFoundException {
        this.accountList = readOldMaster();
        this.transactionRecords = readTransactions();
    }

    // Reads the old master file
    private LinkedList<Account> readOldMaster() throws FileNotFoundException {
        // Creates variables to be later used in the code
        FileInputStream fileStream = new FileInputStream("OldMaster.txt");
        Scanner fileScanner = new Scanner(fileStream);
        LinkedList<Account> newAccountList = new LinkedList<Account>();

        // Reads each line of the file
        while(fileScanner.hasNext()) {
            int accountNumber = fileScanner.nextInt();
            String firstName = fileScanner.next();
            String lastName = fileScanner.next();
            double accountBalance = fileScanner.nextDouble();
            Account currentAccount = new Account(accountNumber, firstName, lastName, accountBalance);
            newAccountList.add(currentAccount);
        }

        // Closes scanners
        fileScanner.close();
        fileScanner.close();

        // Returns the new linked list
        return newAccountList;
    }

    // Reads the transactions file
    private LinkedList<TransactionRecord> readTransactions() throws FileNotFoundException {
        // Creates variables to be later used in the code
        FileInputStream fileStream = new FileInputStream("Transaction.txt");
        Scanner fileScanner = new Scanner(fileStream);
        LinkedList<TransactionRecord> newTransactionList = new LinkedList<TransactionRecord>();

        // Reads each line of the file
        while(fileScanner.hasNext()) {
            int accountNumber = fileScanner.nextInt();
            double transactionAmount = fileScanner.nextDouble();
            TransactionRecord transactionRecord = new TransactionRecord(accountNumber, transactionAmount);
            newTransactionList.add(transactionRecord);
        }

        // Closes scanners
        fileScanner.close();
        fileScanner.close();

        // Returns the new linked list
        return transactionRecords;
    }

    public void compareFiles() {
        try {
            for (Account account : accountList) {
                boolean found = false;
                for (TransactionRecord transaction : transactionRecords) {
                    if (account.getAccountNumber() == transaction.getAccountNumber()) {
                        account.setBalance(account.combine(transaction));
                        writeNewMasterFile(account);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    writeNewMasterFile(account);
                }
            }
            for (TransactionRecord transaction : transactionRecords) {
                boolean found = false;
                for (Account account : accountList) {
                    if (account.getAccountNumber() == transaction.getAccountNumber()) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    writeLogFile(transaction.getAccountNumber());
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    // writes newmast file containing updated account information
    public void writeNewMasterFile(Account newAccount) throws IOException {
        try {
            FileWriter writer = new FileWriter("NewMaster.txt", true);
            writer.write(newAccount.getAccountNumber() + " " + newAccount.getFirstName() + " " + newAccount.getLastName() + " " + newAccount.getBalance() + "\n");
            writer.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    // writes log file containing unmatched transaction errors
    public void writeLogFile(int accountNumber) throws IOException {
        try {
            FileWriter writer = new FileWriter("TransactionLog.txt", true);
            writer.write("No match for transaction record on account #" + accountNumber + ".\n");
            writer.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}