// Program to play the Teddy Bear game with the goal of 42 

import java.util.*;

public class Assignment3 {
// solution by Takyiu Liu, West Valley College, summer 2019 (my work below)
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for (int i = 50; i <= 500; i++) {
			System.out.println("\nStarting number:" + i);
			if (bears(stack, i))
				while (!stack.isEmpty())
					System.out.println(stack.pop());
			else
				System.out.println("No solution");
		}
	}

	static boolean bears(Stack<String> stack, int n) {
		int product;
		if (n == 42)
			return true;
		else if (n < 42)
			// your work
			return false;
		else if ((n % 2 == 0) && bears(stack, n / 2)) {
			// your work
			stack.push("n=" + n + ", return " + n / 2 + ". Now n=" + n / 2 + ".");
			return true;
		}
		else if ((n % 5 == 0) && bears(stack, n - 42)) {
			// your work
			stack.push("n=" + n + ", return " + 42 + ". Now n=" + (n - 42) + ".");
			return true;
		}
		else {
			product = ((n % 100) / 10) * (n % 10);
			// your work
			if (product == 0)
				return false;
			else if (((n % 3 == 0) && bears(stack, n - product)) || ((n % 4 == 0) && bears(stack, n - product))) {
				stack.push("n=" + n + ", return " + product + ". Now n=" + (n - product) + ".");
				return true;
			}
		}
		return false;
	}
}


/* Output (last 3 numbers: 498, 499, 500)

Starting number:498
n=498, return 249. Now n=249.
n=249, return 36. Now n=213.
n=213, return 3. Now n=210.
n=210, return 42. Now n=168.
n=168, return 84. Now n=84.
n=84, return 42. Now n=42.

Starting number:499
No solution

Starting number:500
n=500, return 250. Now n=250.
n=250, return 42. Now n=208.
n=208, return 104. Now n=104.
n=104, return 52. Now n=52.
n=52, return 10. Now n=42.


*/
