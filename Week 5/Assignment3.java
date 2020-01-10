// Calculate day of the week using Zeller's congruence

import java.util.Scanner;

public class Assignment3 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter year
		System.out.print("Enter full year (e.g., 2001): ");
		int year = input.nextInt();
		// Prompt the user to enter month
		System.out.print("Enter month in number between 1 and 12: ");
		int month = input.nextInt();
		// Print calendar for the month of the year
		//printMonth(year, month);
		String monthName = getMonthName(month);
		String startDay = getStartDay(year, month);
		System.out.print("\nThe first day of " + monthName + " " + year
				+ " is a " + startDay);
	}
	
	/** Print the calendar for a month in a year */
	/*public static void printMonth(int year, int month) {
		// Print the headings of the calendar
		printMonthTitle(year, month);
		// Print the body of the calendar
		printMonthBody(year, month);
	}
	*/
	
	/** Print the month title, e.g., May, 1999 */
	/*public static void printMonthTitle(int year, int month) {
		System.out.println("         " + getMonthName(month)
		+ " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	*/
	
	/** Get the English name for the month */
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1: monthName = "January"; break;
		case 2: monthName = "February"; break;
		case 3: monthName = "March"; break;
		case 4: monthName = "April"; break;
		case 5: monthName = "May"; break;
		case 6: monthName = "June"; break;
		case 7: monthName = "July"; break;
		case 8: monthName = "August"; break;
		case 9: monthName = "September"; break;
		case 10: monthName = "October"; break;
		case 11: monthName = "November"; break;
		case 12: monthName = "December";
		}
		return monthName;
	}
	
	/** Print month body */
	/*public static void printMonthBody(int year, int month) {
		// Get start day of the week for the first date in the month
		int startDay = getStartDay(year, month);
		// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		// Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}
	*/
	
	/** Get the start day of month/1/year */
	public static String getStartDay(int year, int month) {
		//final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		//int totalNumberOfDays = getTotalNumberOfDays(year, month);
		// Return the start day for month/1/year
		//return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
		
		// Initialization and potential correction of month and year for formula accuracy
		String startDay = "";
		if (month == 1 || month == 2) {
			month += 12;
			year -= 1;
		}
		int k = year % 100, j = year / 100;
		
		// Formula and return of day of the week
		int h = 1 + (26 * (month + 1)) / 10 + k + (k / 4) + (j / 4) + 5 * j;
		
		switch (h % 7) {
		case 0: startDay = "Saturday"; break;
		case 1: startDay = "Sunday"; break;
		case 2: startDay = "Monday"; break;
		case 3: startDay = "Tuesday"; break;
		case 4: startDay = "Wednesday"; break;
		case 5: startDay = "Thursday"; break;
		case 6: startDay = "Friday";
		}
		return startDay;
	}
	
	/** Get the total number of days since January 1, 1800 */
	/*public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;
		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);
		return total;
	}
	*/
	
	/** Get the number of days in a month */
	/*public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2) return isLeapYear(year) ? 29 : 28;
			return 0; // If month is incorrect
	}
	*/
	
	/** Determine if it is a leap year */
	/*public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	*/
}


/* Output (2 test cases)

(Regular year)
Enter full year (e.g., 2001): 2030
Enter month in number between 1 and 12: 8

The first day of August 2030 is a Thursday

(Leap year)
Enter full year (e.g., 2001): 2020
Enter month in number between 1 and 12: 3

The first day of March 2020 is a Sunday

*/