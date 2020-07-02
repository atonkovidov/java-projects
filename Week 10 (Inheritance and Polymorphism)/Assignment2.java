// Prints an account summary with a list of all transactions

public class Assignment2 {
	public static void main(String[] args) {
		Account1.setAnnualInterestRate(5.5);
		Account1 account = new Account1("George", 1122, 1000);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		System.out.println("Name: " + account.getName());
		System.out.println("Annual interest rate: " + Account1.getAnnualInterestRate());
		System.out.println("Balance: " + account.getBalance());
		java.util.ArrayList<Transaction> list = account.getTransactions();
		System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");
		for (int i = 0; i < list.size(); i++) {
			Transaction transaction = (Transaction) (list.get(i));
			System.out.printf("%-35s%-15s%-15s%-15s\n", transaction.getDate(), transaction.getType(),
					transaction.getAmount(), transaction.getBalance());
		}
	}
}

class Account1 {
	private int id;
	private String name;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated;
	private java.util.ArrayList<Transaction> transactions = new java.util.ArrayList<>();

	public Account1() {
		this("Joan", 0000, 0000);
	}

	public Account1(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public java.util.ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public String getName() {
		return name;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void setAnnualInterestRate(double newannualInterestRate) {
		annualInterestRate = newannualInterestRate;
	}

	public double getMonthlyInterest() {
		return annualInterestRate / 12;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void withdraw(double amount) {
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, "This was a withdrawal"));
	}

	public void deposit(double amount) {
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, "This was a deposit"));
	}
}

class Transaction {
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	public java.util.Date getDate() {
		date = new java.util.Date();
		return date;
	}

	public char getType() {
		return (char) type;
	}

	public double getAmount() {
		return amount;
	}

	public double getBalance() {
		return balance;
	}

	public String getDescription() {
		return description;
	}
}

/* Output

Name: George
Annual interest rate: 5.5
Balance: 1109.0
Date                               Type           Amount         Balance        
Fri Nov 08 18:53:11 PST 2019       D              30.0           1030.0         
Fri Nov 08 18:53:11 PST 2019       D              40.0           1070.0         
Fri Nov 08 18:53:11 PST 2019       D              50.0           1120.0         
Fri Nov 08 18:53:11 PST 2019       W              5.0            1115.0         
Fri Nov 08 18:53:11 PST 2019       W              4.0            1111.0         
Fri Nov 08 18:53:11 PST 2019       W              2.0            1109.0         

*/
