/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP4: File Matching
**/

// Account class for storing records as objects.
public class Account {
	private int accountNumber;
	private String firstName;
	private String lastName;
	private double balance;

	// initializes an Account with default values
	public Account() {this(0, "", "", 0.0);}

	// initializes an Account with provided values
	public Account(int accountNumber, String firstName, String lastName, double balance) {
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	// get account number
	public int getAccountNumber() {return accountNumber;}

	// set account number
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// get first name
	public String getFirstName() {
		return firstName;
	}

	// set first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// get last name
	public String getLastName() {
		return lastName;
	}
	
	// set last name
	public void setLastName(String lastName) {
		this.lastName = lastName;}

	// get balance
	public double getBalance() {
		return balance;
	}

	// set balance
 	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Combines balance and the amount of the transaction
	public double combine(TransactionRecord transRecord) {
		return balance + transRecord.getAmount();
	}
}