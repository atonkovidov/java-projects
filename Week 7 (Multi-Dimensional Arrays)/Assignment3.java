// Display a corresponding Heads/Tails matrix based on a binary conversion of a user-entered number

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// Getting a number from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		short number = input.nextShort();
		
		// Converting the user's number to a binary array of characters
		char[] binaryMatrix = toBinaryChars(number);
		
		// Displaying the binary matrix as a 3-by-3 matrix
		for (int i = 0; i < binaryMatrix.length; i++) {
			if (binaryMatrix[i] == '0') {
				if (i != 0 && i % 3 == 0)
					System.out.println();
				System.out.print("H ");
			}
			else {
				if (i != 0 && i % 3 == 0)
					System.out.println();
				System.out.print("T ");
			}
		}
	}

	// Method for converting a short number to an array of binary characters
	public static char[] toBinaryChars(short number) {
		char[] result = new char[9];
		
		int i = result.length - 1;
		while (number != 0) {
			if (number % 2 == 0)
				result[i--] = '0';
			else
				result[i--] = '1';
			number /= 2;
		}
		
		for (int k = i; k >= 0; k--)
			result [k] = '0';
		
		return result;
	}
}


/* Output (8 in binary is 000001000)

Enter a number between 0 and 511: 8
H H H 
H H T 
H H H 

*/
