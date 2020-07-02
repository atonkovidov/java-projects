// Find and display roots using the Quadratic Formula, accounting for one, two, or zero real roots

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Obtaining a, b, c values
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Calculating the discriminant
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		
		// Calculating and displaying the (potential) roots
		if (discriminant > 0) {
			double root1 = (-b + Math.pow(discriminant, 1/2.0)) / 2 * a;
			double root2 = (-b - Math.pow(discriminant, 1/2.0)) / 2 * a;
			System.out.println("The equation has two roots " + root1 + " and " + root2);
		}
		else if (discriminant == 0) {
			double root = (-b + Math.pow(discriminant, 1/2.0)) / 2 * a;
			System.out.println("The equation has one root " + root);
		}
		else
			System.out.println("The equation has no real roots");
	}
}


/* Output (3 test cases)
 
Two Roots:

Enter a, b, c: 1 3 1
The equation has two roots -0.3819660112501051 and -2.618033988749895

One Root:

Enter a, b, c: 1 2 1
The equation has one root -1.0

No Roots:

Enter a, b, c: 1 2 3
The equation has no real roots

*/
