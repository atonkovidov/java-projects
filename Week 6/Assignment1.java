// Revising a previous method of finding prime numbers

public class Assignment1 {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
		int[] primeNumbers = new int[NUMBER_OF_PRIMES];
		
		System.out.println("The first 50 prime numbers are");
		
		while (count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;
			for (int i = 0; i < count && primeNumbers[i] <= Math.sqrt(number); i++) {
				if (number % primeNumbers[i] == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				primeNumbers[count] = number;
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
					System.out.println(number);
				else
					System.out.print(number + " ");
			}
			number++;
		}
	}
}


/* Output

The first 50 prime numbers are
2 3 5 7 11 13 17 19 23 29
31 37 41 43 47 53 59 61 67 71
73 79 83 89 97 101 103 107 109 113
127 131 137 139 149 151 157 163 167 173
179 181 191 193 197 199 211 223 227 229

*/
