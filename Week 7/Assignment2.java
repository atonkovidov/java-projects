// Program sorts the columns of a user-entered 3-by-3 matrix

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// Preparing to enter the matrix
		double[][] matrix = new double[3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row:");
		
		// Loop for populating the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		System.out.println();
		double[][] sortedMatrix = sortColumns(matrix);
		
		// Printing out the sorted matrix
		System.out.println("The column-sorted array is");
		for (int i = 0; i < sortedMatrix.length; i++) {
			for (int j = 0; j < sortedMatrix[0].length; j++)
				System.out.print(sortedMatrix[i][j] + " ");
			System.out.println();
		}
	}

	// Method for sorting the columns of the matrix
	public static double[][] sortColumns(double[][] matrix){
		double[][] sorted = new double[matrix.length][matrix.length];
		double[] temp = new double[matrix.length];
		// Loop for sorting the columns of the matrix into a new matrix
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				// Adding values to the temp matrix
				temp[j] = matrix[j][i];
			}
			// Sorting the temp matrix
			java.util.Arrays.sort(temp);
			for (int k = 0; k < temp.length; k++) {
				sorted[k][i] = temp[k];
			}
		}
		return sorted;
	}
}


/* Output

Enter a 3-by-3 matrix row by row:
3 5 7
1 2 3
2 4 6

The column-sorted array is
1.0 2.0 3.0 
2.0 4.0 6.0 
3.0 5.0 7.0 

*/