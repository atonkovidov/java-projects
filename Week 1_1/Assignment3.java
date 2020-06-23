// Finds values of x and y in a given set of equations using Cramer's rule

public class Assignment3 {
	
	public static void main(String[] args) {
		double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9, x, y;
		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);
		System.out.println("Given equations " + a + "x + " + b + "y = " + e + 
				" and " + c + "x + " + d + "y = " + f + ", Cramer's rule "
				+ "indicates that x = " + x + " and y = " + y + ".");
	}
}
 

/* Output (Split into two lines for easier viewing)

Given equations 3.4x + 50.2y = 44.5 and 2.1x + 0.55y = 5.9,
Cramer's rule indicates that x = 2.623901496861419 and y = 0.7087397392563978.

*/
