// Adding numerous fractions together using the given Rational class 

public class Assignment1 {
	public static void main(String[] args) {
		// Initializing values in preparation for loop
		final int LAST_VALUE = 19;
		Rational fraction = new Rational();
		
		// Main loop for adding fractions
		for (int i = 1; i <= LAST_VALUE; i++) {
			Rational temporaryFraction = new Rational(i, i + 1);
			fraction = fraction.add(temporaryFraction);
		}
		
		// Printing out the final rational number in fraction form
		System.out.print(fraction.toString());
	}
}


/* Output (took a while to compute)

254554945/15519504

*/
