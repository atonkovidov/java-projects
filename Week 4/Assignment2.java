// Program displays PI value approximation for numerous iterations of a common formula 

public class Assignment2 {

	public static void main(String[] args) {
		// Initializing variables
		int round = 1;
		
		// Iteration increase loop (shell around main loop)
		while (round <= 10) {
			long i = round * 10000; 
			double pi = 0;
			
			// Main loop
			for (long h = 1; h <= i; h++)
				pi += Math.pow(-1, h + 1) / (2 * h - 1);
			
			// Display pi approximation and move onto next round
			System.out.println(i + ": " + 4 * pi);
			round++;
		}	
	}
}


/* Output

10000: 3.1414926535900345
20000: 3.1415426535898248
30000: 3.141559320256462
40000: 3.1415676535897985
50000: 3.1415726535897814
60000: 3.141575986923102
70000: 3.141578367875482
80000: 3.1415801535897496
90000: 3.1415815424786238
100000: 3.1415826535897198

*/
