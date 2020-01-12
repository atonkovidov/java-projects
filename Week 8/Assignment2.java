// A class that creates an account object with various information in it
// and prints out balance, monthly interest, and date of account creation

import java.util.Date;

public class Assignment2 {

	public static void main(String[] args) {
		// Initializing data values and creating a default Account object
		int id = 1122;
		double balance = 20000;
		double interest = 4.5;
		Account test = new Account();
		
		// Changing data values
		test.setId(id);
		test.setBalance(balance);
		Account.setAnnualInterestRate(interest);
		
		// Adjusting the balance
		test.withdraw(2500);
		test.deposit(3000);
		
		// Printing account information
		System.out.println("Account summary for " + test.getId() + ":");
		System.out.printf("Balance: $%1.2f\n", test.getBalance());
		System.out.printf("Monthly Interest: $%1.2f\n", test.getMonthlyInterest());
		System.out.println("Date of account creation: " + test.getDateCreated());
	}
	
	// Account Class
	static class Account {
		private int id;
		private double balance;
		private static double annualInterestRate = 0;
		private Date dateCreated = new Date();
		
		Account() {
			this(0, 0.0);
		}
		
		Account(int id, double balance) {
			this.id = id;
			this.balance = balance;
		}
		
		int getId() {
			return id;
		}
		
		double getBalance() {
			return balance;
		}
		
		static double getAnnualInterestRate() {
			return annualInterestRate;
		}
		
		static double getMonthlyInterestRate() {
			return annualInterestRate / 12;
		}
		
		Date getDateCreated() {
			return dateCreated;
		}
		
		void setId(int id) {
			this.id = id;
		}
		
		void setBalance(double balance) {
			this.balance = balance;
		}
		
		static void setAnnualInterestRate(double annualInterestRate) {
			Account.annualInterestRate = annualInterestRate;
		}
		
		double getMonthlyInterest() {
			return balance * (getMonthlyInterestRate() / 100);
		}
		
		void withdraw(double amount) {
			balance -= amount;
		}
		
		void deposit(double amount) {
			balance += amount;
		}
	}
}


/* Output

Account summary for 1122:
Balance: $20500.00
Monthly Interest: $76.88
Date of account creation: Sun Oct 27 17:23:55 PDT 2019

*/