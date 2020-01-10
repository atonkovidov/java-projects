// Program converts a user-provided Celsius value to Fahrenheit

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		//Conversion calculation
		double fahrenheit = (9 / 5.0) * celsius + 32;
		
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	}
}


/* Output

Enter a degree in Celsius: 38
38.0 Celsius is 100.4 Fahrenheit

*/
