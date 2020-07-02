// Displays the shipping cost of a package with a user-specified weight

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Obtaining weight of package
		System.out.print("Enter the weight of your package (in pounds): ");
		double weight = input.nextDouble();
		
		// Displaying the corresponding shipping cost
		if (weight > 20)
			System.out.println("The package cannot be shipped.");
		else
			System.out.print("The shipping cost of your package is ");
		
		if (weight <= 1)
			System.out.println("$3.50");
		else if (weight <= 3)
			System.out.println("$5.50");
		else if (weight <= 10)
			System.out.println("$8.50");
		else if (weight <= 20)
			System.out.println("$10.50");
	}
}


/* Output (5 test cases)

Enter the weight of your package (in pounds): .4
The shipping cost of your package is $3.50

Enter the weight of your package (in pounds): 2.7
The shipping cost of your package is $5.50

Enter the weight of your package (in pounds): 9.6
The shipping cost of your package is $8.50

Enter the weight of your package (in pounds): 11.7
The shipping cost of your package is $10.50

Enter the weight of your package (in pounds): 29
The package cannot be shipped.

*/
