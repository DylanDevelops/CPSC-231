/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP4: File Matching
**/

public class TransactionRecord {
    // Member variables
    private int m_accountNumber;
    private double m_amount;

    // Default Constructor
    public TransactionRecord() {
        this(0, 0.0);
    }

    // Copy Constructor
    public TransactionRecord(TransactionRecord transactionRecord) {
        this(transactionRecord.m_accountNumber, transactionRecord.m_amount);
    }

    // Overloaded constructor
    public TransactionRecord(int accountNumber, double amount) {
        this.m_accountNumber = accountNumber;
        this.m_amount = amount;
    }

    // Setters
    public void setAccountNumber(int accountNumber) { m_accountNumber = accountNumber; }
    public void setAccountNumber(double amount) { m_amount = amount; }

    // Getters
    public int getAccountNumber() { return m_accountNumber; }
    public double getAmount() { return m_amount; }
}
