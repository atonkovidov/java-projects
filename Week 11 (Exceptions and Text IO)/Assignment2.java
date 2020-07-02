// Create a file that is given 100 randomly created integers
// and then display them in increasing order

import java.util.Scanner;
import java.util.Arrays;

public class Assignment2 {
	public static void main(String[] args) throws Exception {
		// Creating file for random numbers
		java.io.File numbers = new java.io.File("Exercise12_15.txt");
		java.io.PrintWriter input = new java.io.PrintWriter(numbers);
		
		// Generating and writing random numbers to the file
		final int amountOfNumbers = 100;
		for (int i = 0; i < amountOfNumbers; i++) {
			if (i == 99)
				input.print((int)(Math.random() * amountOfNumbers));
			else
				input.print((int)(Math.random() * amountOfNumbers) + " ");
		}
		input.close();
		
		// Reading the random numbers from the file and arranging them into an array with
		// increasing order
		Scanner output = new Scanner(numbers);
		int[] display = new int[amountOfNumbers];
		for (int i = 0; i < amountOfNumbers; i++) {
			display[i] = output.nextInt();
		}
		output.close();
		
		// Sorting the numbers
		Arrays.sort(display);
		
		// Displaying the numbers
		for (int i = 0; i < amountOfNumbers; i++) {
			if ((i + 1) % 20 == 0) {
				System.out.print(display[i]);
				System.out.println();
			}
			else
				System.out.print(display[i] + " ");
		}
	}
}


/* Output

0 0 3 3 3 3 4 7 7 8 10 11 13 16 16 17 18 19 21 21
23 28 29 30 31 32 32 32 34 35 36 37 37 39 40 40 40 40 41 44
45 46 47 47 48 48 49 50 50 50 54 54 54 55 56 56 56 57 58 59
59 60 60 61 63 63 63 64 65 66 68 68 69 69 70 71 71 73 73 74
75 76 77 77 79 79 79 81 84 85 85 86 88 89 90 90 91 91 91 93 

*/
