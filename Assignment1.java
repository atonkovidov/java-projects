// Find the smallest factors of an integer and displays them in increasing order

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Obtaining number from user
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// Obtaining and displaying factors
		int factor = 2;
		do {
			if (number % factor == 0 && number != factor) {
				System.out.print(factor + ", ");
				number /= factor;
			}
			// Displaying last factor (without comma)
			else if (number == factor) {
				System.out.println(factor);
				break;
			}
			else
				factor++;
		}
		while (factor <= number);
	}
}


/* Output (3 test cases)

Enter an integer: 7
7

Enter an integer: 120
2, 2, 2, 3, 5

Enter an integer: 2933
7, 419

*/