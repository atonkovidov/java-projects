// Fill a matrix randomly with 0s and 1s and find the row and column with the most 1s

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {
  public static void main(String[] args) {
    System.out.print("Enter the array size n: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    System.out.println("The random array is:");
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = (int)(Math.random() * 2);
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
    
    // Creating ArrayLists to store the sums of rows and columns
    ArrayList<Integer> rowSums = new ArrayList<>();
    ArrayList<Integer> columnSums = new ArrayList<>();
    
    // Finding sums and storing the index of the biggest one(s) in the ArrayLists
    int largestSum = 0;
    for (int i = 0; i < n; i++) {
    	int currentSum = sumRow(matrix[i]);
    	if (currentSum > largestSum) {
    		rowSums.clear();
    		rowSums.add(i);
    		largestSum = currentSum;
    	}
    	else if (currentSum == largestSum)
    		rowSums.add(i);
    	else
    		continue;
    }
    
    largestSum = 0;
    for (int i = 0; i < n; i++) {
    	int currentSum = sumColumn(matrix, i);
    	if (currentSum > largestSum) {
    		columnSums.clear();
    		columnSums.add(i);
    		largestSum = currentSum;
    	}
    	else if (currentSum == largestSum)
    		columnSums.add(i);
    	else
    		continue;
    }
    
    // Printing out the indices with the largest amount of 1s
    // Row indices
    System.out.print("The largest row index: ");
    for (int i = 0; i < rowSums.size(); i++) {
    	if (i == rowSums.size() - 1)
    		System.out.print(rowSums.get(i));
    	else
    		System.out.print(rowSums.get(i) + ", ");
    }
    System.out.println();
    
    // Column indices
    System.out.print("The largest column index: ");
    for (int i = 0; i < columnSums.size(); i++) {
    	if (i == columnSums.size() - 1)
    		System.out.print(columnSums.get(i));
    	else
    		System.out.print(columnSums.get(i) + ", ");
    }
  }
  
  public static int sumRow(int row[]) {
	  int sum = 0;
	  for (int i = 0; i < row.length; i++)
		  sum += row[i];
	  return sum;
  }
  
  public static int sumColumn(int matrix[][], int column) {
	  int sum = 0;
	  for (int i = 0; i < matrix.length; i++)
		  sum += matrix[i][column];
	  return sum;
  }
}

/* Output

Enter the array size n: 4
The random array is:
1010
1011
0011
1101
The largest row index: 1, 3
The largest column index: 0, 2, 3

*/
