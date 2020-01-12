// A recursive method for finding the GCD of two user-provided integers

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// Obtaining the two integers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers separated by a space: ");
		int m = input.nextInt();
		int n = input.nextInt();
		
		System.out.print("\nThe greatest common divisor of " + m + " and " + n + " is " + gcd(m, n));
		input.close();
	}
	
	// Recursive GCD method
	public static int gcd(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return gcd(n, m % n);
	}
}


/* Output (three cases)

Enter two integers separated by a space: 900 11

The greatest common divisor of 900 and 11 is 1


Enter two integers separated by a space: 225 12

The greatest common divisor of 225 and 12 is 3


Enter two integers separated by a space: 49 7

The greatest common divisor of 49 and 7 is 7

*/
