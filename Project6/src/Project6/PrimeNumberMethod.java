package Project6;

/**
 * A simple program to display the first 50 prime numbers and provide a method
 * to check if a number is prime.
 */
public class PrimeNumberMethod {

	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are: \n");
		printPrimeNumbers(50);
	}

	/**
	 * Prints the first n prime numbers.
	 * 
	 * @param numberOfPrimes The number of prime numbers to print.
	 */
	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count of prime numbers found
		int number = 2; // Number to be tested

		while (count < numberOfPrimes) {
			if (isPrime(number)) {
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print number and move to a new line
					System.out.printf("%-5s\n", number);
				} else {
					// Print number in the same line
					System.out.printf("%-5s", number);
				}
			}
			number++;
		}
	}

	/**
	 * Checks if a number is prime.
	 * 
	 * @param number The number to be checked.
	 * @return true if the number is prime, false otherwise.
	 */
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false; // Not a prime number
			}
		}
		return true; // Prime number
	}
}
