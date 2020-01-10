// Program calculates the distance between two user-provided points

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Calculation of distance
		double a = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		double distance = Math.pow(a, 1.0/2);
		
		System.out.println("The distance between the two points is " + distance);
	}
}


/* Output

Enter x1 and y1: 0 0
Enter x2 and y2: 3 4
The distance between the two points is 5.0

*/