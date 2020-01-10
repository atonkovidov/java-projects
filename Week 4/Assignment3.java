// Ask user for year and first day of the week of that year
// and then print out the year's full calendar

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// Prompt user for year and day of week
		Scanner input = new Scanner(System.in);
		// Year
		System.out.print("Enter a year: ");
		long year = input.nextLong();
		// Day of week
		System.out.printf("Enter the first day of " + year + ": ");
		int firstDay = input.nextInt();
		
		// Main loop for displaying calendar
		for (int month = 1; month <= 12; month++) {
			System.out.print("\n\n");
			String monthName = null;
			int monthDays = 0;
			
			// Selecting the month
			switch (month) {
			case 1: monthName = "January";
				monthDays = 31; break;
			case 2: monthName = "February";
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					monthDays = 29;
				else
					monthDays = 28;
				break;
			case 3: monthName = "March";
				monthDays = 31; break;
			case 4: monthName = "April";
				monthDays = 30; break;
			case 5: monthName = "May";
				monthDays = 31; break;
			case 6: monthName = "June";
				monthDays = 30; break;
			case 7: monthName = "July";
				monthDays = 31; break;
			case 8: monthName = "August";
				monthDays = 31; break;
			case 9: monthName = "September";
				monthDays = 30; break;
			case 10: monthName = "October";
				monthDays = 31; break;
			case 11: monthName = "November";
				monthDays = 30; break;
			case 12: monthName = "December";
				monthDays = 31; break;
			}
			
			// Displaying each month
			System.out.printf("%14s" + monthName + " " + year
					+ "\n-----------------------------------------\n", "");
			System.out.println(" Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
			
			// Loop for proper display of days
			for(int day = 1; day <= monthDays + firstDay; day++) {
				if (day <= firstDay) {
					System.out.printf("%6s", "");
					continue;
				}
				System.out.printf("%3s%3s", day - firstDay, "");
				if (day % 7 == 0)
					System.out.print("\n");
			}
			firstDay = (monthDays + firstDay) % 7;
		}
	}
}

/* Output

Enter a year: 2019
Enter the first day of 2019: 2


              January 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
              1     2     3     4     5   
  6     7     8     9    10    11    12   
 13    14    15    16    17    18    19   
 20    21    22    23    24    25    26   
 27    28    29    30    31   

              February 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
                                1     2   
  3     4     5     6     7     8     9   
 10    11    12    13    14    15    16   
 17    18    19    20    21    22    23   
 24    25    26    27    28   

              March 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
                                1     2   
  3     4     5     6     7     8     9   
 10    11    12    13    14    15    16   
 17    18    19    20    21    22    23   
 24    25    26    27    28    29    30   
 31   

              April 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
        1     2     3     4     5     6   
  7     8     9    10    11    12    13   
 14    15    16    17    18    19    20   
 21    22    23    24    25    26    27   
 28    29    30   

              May 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
                    1     2     3     4   
  5     6     7     8     9    10    11   
 12    13    14    15    16    17    18   
 19    20    21    22    23    24    25   
 26    27    28    29    30    31   

              June 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
                                      1   
  2     3     4     5     6     7     8   
  9    10    11    12    13    14    15   
 16    17    18    19    20    21    22   
 23    24    25    26    27    28    29   
 30   

              July 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
        1     2     3     4     5     6   
  7     8     9    10    11    12    13   
 14    15    16    17    18    19    20   
 21    22    23    24    25    26    27   
 28    29    30    31   

              August 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
                          1     2     3   
  4     5     6     7     8     9    10   
 11    12    13    14    15    16    17   
 18    19    20    21    22    23    24   
 25    26    27    28    29    30    31   


              September 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
  1     2     3     4     5     6     7   
  8     9    10    11    12    13    14   
 15    16    17    18    19    20    21   
 22    23    24    25    26    27    28   
 29    30   

              October 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
              1     2     3     4     5   
  6     7     8     9    10    11    12   
 13    14    15    16    17    18    19   
 20    21    22    23    24    25    26   
 27    28    29    30    31   

              November 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
                                1     2   
  3     4     5     6     7     8     9   
 10    11    12    13    14    15    16   
 17    18    19    20    21    22    23   
 24    25    26    27    28    29    30   


              December 2019
-----------------------------------------
 Sun   Mon   Tue   Wed   Thu   Fri   Sat 
  1     2     3     4     5     6     7   
  8     9    10    11    12    13    14   
 15    16    17    18    19    20    21   
 22    23    24    25    26    27    28   
 29    30    31   

*/