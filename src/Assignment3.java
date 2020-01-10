// Program reads user-provided information and prints out a payroll statement

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asking user for all the required information
		// Name
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		// Hours worked
		System.out.print("Enter number of hours worked in a week: ");
		Double hours = input.nextDouble();
		
		// Pay rate
		System.out.print("Enter hourly pay rate: ");
		Double payRate = input.nextDouble();
		
		// Federal tax withholding rate
		System.out.print("Enter federal tax withholding rate: ");
		Double fedTax = input.nextDouble();
		
		// State tax withholding rate
		System.out.print("Enter state tax withholding rate: ");
		Double stateTax = input.nextDouble();
		
		// Outputting correctly formatted information for a payroll statement
		// Name
		System.out.println("\nEmployee Name: " + name);
		
		// Hours worked
		System.out.println("Hours worked: " + hours);
		
		//Pay rate and gross pay
		double grossPay = payRate * hours;
		System.out.printf("Pay rate: $%4.2f\n", payRate);
		System.out.printf("Gross pay: $%4.1f\n", grossPay);
		
		// Deductions
		// Federal
		Double fedDeduction = grossPay * fedTax;
		System.out.printf("Deductions:\n" + "%2s%10s%3.1f%2s%4.1f\n", "", "Federal Withholding (",
		fedTax * 100, "%): $", fedDeduction);
		
		// State (floor function used to reproduce author's example)
		Double stateDeduction = Math.floor(grossPay * stateTax * 100) / 100;
		System.out.printf("%2s%10s%3.1f%2s%4.2f\n", "", "State Withholding (", stateTax * 100,
		"%): $", stateDeduction);
		
		// Total
		Double totalDeduction = fedDeduction + stateDeduction;
		System.out.printf("%2s%10s%4.2f\n", "", "Total Deduction: $", totalDeduction);
		
		// Net pay (ceiling function used to reproduce author's example)
		System.out.printf("Net Pay: $%4.2f", grossPay - Math.ceil(grossPay * stateTax * 100)
		/ 100 - grossPay * fedTax);
	}
}


/* Output

Enter employee's name: Smith
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate: .20
Enter state tax withholding rate: .09

Employee Name: Smith
Hours worked: 10.0
Pay rate: $9.75
Gross pay: $97.5
Deductions:
  Federal Withholding (20.0%): $19.5
  State Withholding (9.0%): $8.77
  Total Deduction: $28.27
Net Pay: $69.22

*/