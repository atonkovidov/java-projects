// A stopwatch class that can be started and stopped to track elapsed time
// The class is tested by tracking how long 100,000 numbers are sorted

public class Assignment1 {
	
	public static void main(String[] args) {
		// Selection sort of 100,000 numbers
		// Creating an array with 100,000 random numbers
		int [] test = new int[100000];
		for (int i = 0; i < test.length; i++)
			test[i] = (int)(Math.random() * test.length);
		
		// Testing the stopwatch with a selection sort
		// Creating a stopwatch object
		StopWatch watch1 = new StopWatch();
		// Starting the stopwatch
		watch1.start();
		// Running the selection sort
		selectionSort(test);
		// Stopping the stopwatch
		watch1.stop();
		
		// Displaying the execution time of selection sort
		System.out.print("The execution time of using selection sort on 1,000 random numbers is "
				+ watch1.getElapsedTime() + " milliseconds.");
	}
	
	// Stopwatch Class
	static class StopWatch {
		private long startTime;
		private long endTime;
		
		StopWatch() {
			startTime = System.currentTimeMillis();
		}
		
		void start() {
			startTime = System.currentTimeMillis();
		}
		
		void stop() {
			endTime = System.currentTimeMillis();
		}
		
		long getElapsedTime() {
			return endTime - startTime;
		}
	}
	
	// Selection sort (from book)
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}

/* Output

The execution time of using selection sort on 1,000 random numbers is 1684 milliseconds.

*/
