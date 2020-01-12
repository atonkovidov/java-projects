// Program creates and displays information for a standard Account and two Account subclasses

public class Assignment1 {
	
	public static void main(String[] args) {
		// Creating a generic account
		Account account = new Account(1, 5000);
		// Creating a checking account
		Account checking = new CheckingAccount(2, 6000);
		// Creating a savings account
		Account savings = new SavingsAccount(3, 10000);
		
		// withdraw money and print balance
		account.withdraw(6000);
		System.out.println(account.toString());
		
		checking.withdraw(6000);
		System.out.println(checking.toString());
		
		savings.withdraw(6000);
		System.out.println(savings.toString());
	}
	
	static class CheckingAccount extends Account {
		protected int overdraftLimit = 5000;
		
		public CheckingAccount() {
			super();
		}
		
		public CheckingAccount(int newId, double newBalance) {
			super(newId, newBalance);
		}
		public String toString() {
			return "Account Type: Checking\nAccount ID: " + getId() +
			"\nDate Created: " + getDateCreated() + "\nBalance: $" + getBalance() + "\n";
		}
		
		public void withdraw(double amount) {
			  if (amount > overdraftLimit)
				  System.out.println("Attempted withdrawal is over the withdrawal limit!");
			  else
				  super.withdraw(amount);
		}
		
	}
	
	static class SavingsAccount extends Account {
		
		public SavingsAccount() {
			super();
		}
		
		public SavingsAccount(int newId, double newBalance) {
			super(newId, newBalance);
		}
		
		public void withdraw(double amount) {
			super.withdraw(amount);
		}
		
		public String toString() {
			return "Account Type: Savings\nAccount ID: " + getId() +
			"\nDate Created: " + getDateCreated() + "\nBalance: $" + getBalance() + "\n";
		}
	}
	
	// Account Class (copy of given code)
	static class Account {
		  private int id;
		  private double balance;
		  private static double annualInterestRate;
		  private java.util.Date dateCreated;
		  
		  public Account() {
			  dateCreated = new java.util.Date();
		  }
		  
		  public Account(int newId, double newBalance) {
			  id = newId;
			  balance = newBalance;
			  dateCreated = new java.util.Date();
		  }
		  
		  public int getId() {
			  return this.id;
		  }
		  
		  public double getBalance() {
			  return balance;
		  }
		  
		  public static double getAnnualInterestRate() {
			  return annualInterestRate;
		  }
		  
		  public void setId(int newId) {
			  id = newId;
		  }
		  
		  public void setBalance(double newBalance) {
			  balance = newBalance;
		  }
		  
		  public static void setAnnualInterestRate(double newAnnualInterestRate) {
			  annualInterestRate = newAnnualInterestRate;
		  }
		  
		  public double getMonthlyInterest() {
			  return balance * (annualInterestRate / 1200);
		  }
		  
		  public java.util.Date getDateCreated() {
			  return dateCreated;
		  }
		  
		  public void withdraw(double amount) {
			  if (amount > getBalance())
				 System.out.println("Not enough money in account to withdraw!");
			  else
				 balance -= amount;
		  }
		  
		  public void deposit(double amount) {
			  balance += amount;
		  }
		  
		  public String toString() {
			  return "Account Type: Generic\nAccount ID: " + getId() + 
			 "\nDate Created: " + getDateCreated() + "\nBalance: $" + getBalance() + "\n";
		  }
	}
}

/* Output

Not enough money in account to withdraw!
Account Type: Generic
Account ID: 1
Date Created: Wed Nov 06 14:40:31 PST 2019
Balance: $5000.0

Attempted withdrawal is over the withdrawal limit!
Account Type: Checking
Account ID: 2
Date Created: Wed Nov 06 14:40:31 PST 2019
Balance: $6000.0

Account Type: Savings
Account ID: 3
Date Created: Wed Nov 06 14:40:31 PST 2019
Balance: $4000.0

*/