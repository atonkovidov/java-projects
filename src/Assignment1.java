// Converts and displays a user-provided integer between 0 and 15 to the corresponding hex number

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Collecting number from user
		System.out.print("Enter a decimal value (0 to 15): ");
		int intNumber = input.nextInt();
		
		// Analyze if input is valid and convert it to hex if it is 
		if (intNumber < 10 && intNumber >= 0)
			System.out.println("The hex value is " + intNumber);
		else if (intNumber >= 10 && intNumber <= 15) {
			char hex = (char)((intNumber - 10) + (int)'A');
			System.out.print("The hex value is " + hex);
			}
		else {
			System.out.println(intNumber + " is an invalid input");
			System.exit(1);
		}
	}
}


/* Output (3 test cases)

Enter a decimal value (0 to 15): 3
The hex value is 3

Enter a decimal value (0 to 15): 12
The hex value is C

Enter a decimal value (0 to 15): 47
47 is an invalid input

*/