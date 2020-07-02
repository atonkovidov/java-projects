// Scan and analyze how many times specific words show up in the Mueller Report

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) throws Exception {
		// Initializing an int variable for each word
		int corrupt = 0, obstruct = 0, collude = 0, Russia = 0, indict = 0,
				bribe = 0, tamper = 0, impeach = 0, conspiracy = 0, convict = 0;
		
		// Setting up to read file
		java.io.File report = new java.io.File("mueller-report-searchable.txt");
		Scanner reader = new Scanner(report);
		
		// Reading the file
		while (reader.hasNext()) {
			String word = reader.next();
			if (word.matches("(?i:.*corrupt.*)"))
				corrupt++;
			else if (word.matches("(?i:.*obstruct.*)"))
				obstruct++;
			else if (word.matches("(?i:.*collude.*)"))
				collude++;
			else if (word.matches("(?i:.*Russia.*)"))
				Russia++;
			else if (word.matches("(?i:.*indict.*)"))
				indict++;
			else if (word.matches("(?i:.*bribe.*)"))
				bribe++;
			else if (word.matches("(?i:.*tamper.*)"))
				tamper++;
			else if (word.matches("(?i:.*impeach.*)"))
				impeach++;
			else if (word.matches("(?i:.*conspiracy.*)"))
				conspiracy++;
			else if (word.matches("(?i:.*convict.*)"))
				convict++;
		}
		reader.close();
		
		// Displaying results of file analysis
		System.out.println("Instances of the word\ncorrupt: " + corrupt + "\nobstruct: " + obstruct
				+ "\ncollude: " + collude + "\nRussia: " + Russia + "\nindict: " + indict +
				"\nbribe: " + bribe + "\ntamper: " + tamper + "\nimpeach: " + impeach
				+ "\nconspiracy: " + conspiracy + "\nconvict: " + convict);
	}
}


/* Output

Instances of the word
corrupt: 108
obstruct: 302
collude: 3
Russia: 1611
indict: 83
bribe: 8
tamper: 18
impeach: 11
conspiracy: 44
convict: 33

*/
