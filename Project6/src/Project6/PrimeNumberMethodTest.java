package Project6;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit Test class for isPrime method in PrimeNumberMethod class. This class
 * tests the isPrime method using JUnit.
 */
public class PrimeNumberMethodTest {

	/**
	 * Test for isPrime() method - checking a prime number.
	 */
	@Test
	public void testPrimeNumber() {
		assertTrue(PrimeNumberMethod.isPrime(7));
	}

	/**
	 * Test for isPrime() method - checking a non-prime number.
	 */
	@Test
	public void testNonPrimeNumber() {
		assertFalse(PrimeNumberMethod.isPrime(8));
	}

	/**
	 * Test for isPrime() method - checking edge case with 1.
	 */
	@Test
	public void testEdgeCaseOne() {
		assertFalse(PrimeNumberMethod.isPrime(1));
	}

	/**
	 * Test for isPrime() method - checking edge case with 2.
	 */
	@Test
	public void testEdgeCaseTwo() {
		assertTrue(PrimeNumberMethod.isPrime(2));
	}

	/**
	 * Test for isPrime() method - checking a large prime number.
	 */
	@Test
	public void testLargePrime() {
		assertTrue(PrimeNumberMethod.isPrime(97));
	}

	/**
	 * Test for isPrime() method - checking a large non-prime number.
	 */
	@Test
	public void testLargeNonPrime() {
		assertFalse(PrimeNumberMethod.isPrime(100));
	}
}
