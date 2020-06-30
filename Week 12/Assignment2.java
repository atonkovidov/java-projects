import java.math.BigInteger;

// Adding numerous fractions together using the given Rational class (part dos) 

public class Assignment2 {
	public static void main(String[] args) {
		// Initializing values in preparation for loop
		final int LAST_VALUE = 25;
		RationalBigInteger fraction = new RationalBigInteger();
		
		// Main loop for adding fractions
		for (int i = 1; i <= LAST_VALUE; i++) {
			RationalBigInteger temporaryFraction = new RationalBigInteger(BigInteger.valueOf(i),
					BigInteger.valueOf(i + 1));
			fraction = fraction.add(temporaryFraction);
		}
		
		// Printing out the final rational number in fraction form
		System.out.print(fraction.toString());
	}
}


/* Output (took a while to compute)

When i (aka LAST_VALUE) = 24 : "189040347533/8923714800"

After letting the program work for over 2.5 hours, my computer was unable to compute the final value
for some reason, when i = 25. The program itself DOES work properly though and I did manage to find
the rational when i=24.

*/
