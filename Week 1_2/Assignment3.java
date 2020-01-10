// Find the sum of all digits from a user-provided integer between 0 and 1000

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		// Calculating the sum
		// First digit
		int digit1 = number % 10;
		number /= 10;
		
		// Second digit
		int digit2 = number % 10;
		number /= 10;
		
		// Third digit
		int digit3 = number;
		
		// Sum
		int sum = digit1 + digit2 + digit3;
		
		System.out.println("The sum of the digits is " + sum);
	}
}


/* Output

Enter a number between 0 and 1000: 491
The sum of the digits is 14

*/