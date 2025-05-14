package Project6;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit Test class for String methods: length(), charAt(), substring(),
 * indexOf()
 */
public class StringTest {

	/**
	 * Test for length() method.
	 */
	@Test
	public void testLength() {
		String str = "Hello World";
		assertEquals(11, str.length());
	}

	/**
	 * Test for charAt() method.
	 */
	@Test
	public void testCharAt() {
		String str = "Hello";
		assertEquals('e', str.charAt(1));
	}

	/**
	 * Test for substring() method.
	 */
	@Test
	public void testSubstring() {
		String str = "Hello World";
		assertEquals("World", str.substring(6));
	}

	/**
	 * Test for indexOf() method.
	 */
	@Test
	public void testIndexOf() {
		String str = "Hello World";
		assertEquals(6, str.indexOf("World"));
	}
}
