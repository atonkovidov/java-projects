// Prompts a user to enter an integer and checks whether it is a palindrome or not

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asking user for input
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		//Printing out the result
		System.out.print("The entered integer is ");
		if (isPalindrome(number))
			System.out.print("a palindrome.");
		else
			System.out.print("not a palindrome.");
	}
		
	// Methods
	// isPalindrome method
	public static Boolean isPalindrome(int number) {
		if (number == reverse(number))
			return true;
		else
			return false;
	}

	// reverse method
	public static int reverse(int number) {
		String entry = String.valueOf(number);
		int end = entry.length() - 1;
		String reverseNumber = "";

		while (end >= 0) {
			reverseNumber += entry.charAt(end);
			end--;
		}

		int reverseInteger = Integer.parseInt(reverseNumber);
		return reverseInteger;
	}
}


/* Output (2 test cases)

Enter an integer: 11121
The entered integer is not a palindrome.

Enter an integer: 11121
The entered integer is not a palindrome.

*/
