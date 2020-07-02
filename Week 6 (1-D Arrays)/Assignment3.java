
// Program merges two user-provided sorted lists into a new sorted list

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// Obtaining two sorted lists from use
		Scanner input = new Scanner(System.in);

		// First list
		System.out.print("Enter list1: ");
		int length1 = input.nextInt();
		int[] list1 = new int[length1];
		for (int i = 0; i < length1; i++)
			list1[i] = input.nextInt();

		// Second list
		System.out.print("Enter list2: ");
		int length2 = input.nextInt();
		int[] list2 = new int[length2];
		for (int i = 0; i < length2; i++)
			list2[i] = input.nextInt();

		// Calling the merge method
		int[] result = merge(list1, list2);

		// Printing out the new merged, sorted array
		System.out.print("The merged list is ");
		for (int e : result)
			System.out.print(e + " ");
	}

	// Merging method
	public static int[] merge(int[] list1, int[] list2) {
		// Creating a new empty array
		int[] result = new int[list1.length + list2.length];

		// Initializing indices
		int index1 = 0, index2 = 0, index3 = 0;

		// Main loop for merging
		while (index1 < list1.length && index2 < list2.length) {
			if (list1[index1] < list2[index2]) {
				result[index3] = list1[index1];
				index1++;
			} else {
				result[index3] = list2[index2];
				index2++;
			}
			index3++;
		}

		// Loops for copying the rest of the arrays if one is finished
		while (index1 < list1.length) {
			result[index3] = list1[index1];
			index1++;
			index3++;
		}
		while (index2 < list2.length) {
			result[index3] = list2[index2];
			index2++;
			index3++;
		}
		return result;
	}
}

/* Output
 
Enter list1: 2 1 5
Enter list2: 5 2 3 6 8 9
The merged list is 1 2 3 5 6 8 9
 
*/
