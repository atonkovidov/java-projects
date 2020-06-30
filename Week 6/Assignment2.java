// Program prompts user to enter students' information and then prints their names
// in decreasing order according to their scores 

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// Obtaining student information
		Scanner input = new Scanner(System.in);
		// Number of students
		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		// Creating empty arrays for student names and scores
		String[] names = new String[students];
		double[] scores = new double[students];
		
		// Obtaining student names
		System.out.print("Enter the name of each student: ");
		//input.nextLine();
		for (int i = 0; i < students; i++) {
			//names[i] = input.nextLine();
			names[i] = input.next();
		}
		
		// Obtaining student scores
		System.out.print("Enter the corresponding score of each student: ");
		for (int i = 0; i < students; i++) {
			scores[i] = input.nextDouble();
		}
		
		// Calling the sorting method
		orderedLists(names, scores);
		
		for (int i = 0; i < students; i++) {
			System.out.print(scores[i] + " " + names[i] + "\n");
		}
	}
	
	// Sorting method
	public static void orderedLists(String[] names, double[] scores) {
		for (int i = 0; i < scores.length; i++) {
			double currentMax = scores[i];
			int currentMaxIndex = i;
			
			for (int j = i + 1; j < scores.length; j++) {
				if (currentMax < scores[j]) {
					currentMax = scores[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMax != i) {
				// Move smaller value and name to new positions in array
				String temp = names[currentMaxIndex];
				scores[currentMaxIndex] = scores[i];
				names[currentMaxIndex] = names[i];
				// Move bigger value to higher position
				scores[i] = currentMax;
				names[i] = temp;
			}
		}
	}
}


/* Output

Enter the number of students: 3
Enter the name of each student: Freddy
Jason
Michael
Enter the corresponding score of each student: 10
13
31
31.0 Michael
13.0 Jason
10.0 Freddy

*/
