// Program prompts user to enter a positive integer
// and displays all its smallest factors in decreasing order 

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// Asking user for unfactored number
		StackOfIntegers stack = new StackOfIntegers(4);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Processing the number and displaying its factors
		System.out.println("The factors for " + number + " are");
		
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				stack.increaseSize();
				stack.include(i);
				number /= i;
			}
		}
		int length = stack.getSize(); 
		for (int i = 0; i < length; i++) {
			if (stack.getSize() - 1 == 0)
				System.out.print(stack.pop());
			else
				System.out.print(stack.pop() + ", ");
		}
	}
	
	public static class StackOfIntegers {
		public int[] factors;
		private int size;
		public static final int DEFAULT_SIZE = 8;
		
		public StackOfIntegers() {
			this (DEFAULT_SIZE);
		}
		
		public StackOfIntegers(int size) {
			factors = new int[size];
		}
		
		public void include(int factor) {
			factors[size++] = factor;
		}
		
		public void increaseSize() {
			if (size >= factors.length) {
				int[] temp = new int[size * 2];
				System.arraycopy(factors, 0, temp, 0, factors.length);
				factors = temp;
			}
		}
		
		public int pop() {
			return factors[--size];
		}
		
		public int getSize() {
			return size;
		}
	}
}


/* Output

Enter an integer: 120
The factors for 120 are
5, 3, 2, 2, 2

Enter an integer: 2048
The factors for 2048 are
2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2

*/
