// Recursive method to display all permutations of a string 

import java.util.Scanner;

public class Assingment2 {

	public static void main(String[] args) {
		// Entering the initial string
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		input.close();
		
		// Displaying all permutations of String s
		System.out.println("\nThe permutations of the string " + s + " are");
		displayPermutation(s);
	}
	
	public static void displayPermutation(String s) {
		displayPermutation("", s);
	}
	
	public static void displayPermutation(String s1, String s2) {
		if (s2.length() == 0)
			System.out.println(s1);
		for (int i = 0; i < s2.length(); i++) {
			String s3 = s1 + s2.charAt(i);
			String s4 = s2.substring(0, i) + s2.substring(i + 1);
			displayPermutation(s3, s4);
		}
	}
}


/* Output

Enter a string: abc

The permutations of the string abc are
abc
acb
bac
bca
cab
cba

*/
