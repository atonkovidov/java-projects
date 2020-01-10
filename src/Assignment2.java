// Program prompts user to enter a properly formatted SSN and checks its validity

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asking user for SSN
		System.out.print("Enter a SSN: ");
		String entry = input.nextLine();
		
		// Checking validity of entered SSN
		System.out.print(entry);
		if (entry.length() == 11 && entry.charAt(3) == 45 && entry.charAt(6) == 45)
			System.out.println(" is a valid social security number");
		else
			System.out.println(" is an invalid social security number");
	}
}


/* Output (2 test cases)

Enter a SSN: 999-99-9999
999-99-9999 is a valid social security number

Enter a SSN: 99-999-9999
99-999-9999 is an invalid social security number

*/