// Finding the sum of all elements in diagonal of a 4x4 matrix

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// Preparing to enter the matrix
		double[][] matrix = new double[4][4];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		
		// Loop for populating the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		// Calculating and displaying the sum of the diagonal
		System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
	}
	
	// Method for calculating the sum
	public static double sumMajorDiagonal(double[][] matrix) {
		double sum = 0;
		// Loop for computing the diagonal sum
		for (int i = 0; i < matrix.length; i++)
			sum += matrix[i][i];
		return sum;
	}
}


/* Output

Enter a 4-by-4 matrix row by row:
1 2 3 4
1 1 1 1 
4 4 4 4 
5 5 5 5
Sum of the elements in the major diagonal is 11.0

*/