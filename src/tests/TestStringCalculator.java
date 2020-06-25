/**
 * 
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import programs.StringCalculator;

/**
 * @author Prashant Singh Chauhan
 *
 */
class TestStringCalculator {
	
	private final StringCalculator stringCalculator = new StringCalculator();

	@Test
	void testAddWith0Number() {
		assertEquals(0, stringCalculator.Add(""));
	}
	
	@Test
	void testAddWith1Numbers() {
		assertEquals(1, stringCalculator.Add("1"));
	}
	
	@Test
	void testAddWith2Numbers() {
		assertEquals(3, stringCalculator.Add("1,2"));
	}
	
	@Test
	void testAddWith6Numbers() {
		assertEquals(21, stringCalculator.Add("1,2,3,4,5,6"));
	}
	
	@Test
	void testAddWith9Numbers() {
		assertEquals(45, stringCalculator.Add("1,2,3,4,5,6,7,8,9"));
	}
	
	@Test
	void testAddWithNewLine() {
		assertEquals(6, stringCalculator.Add("1\n2,3"));
	}
	
	@Test
	void testAddWithCustomDelimiter1() {
		assertEquals(3, stringCalculator.Add("//\n\n1\n2"));
	}
	
	@Test
	void testAddWithCustomDelimiter2() {
		assertEquals(3, stringCalculator.Add("//-\n1-2"));
	}
	
	@Test
	void testAddWithCustomDelimiter3() {
		assertEquals(3, stringCalculator.Add("//;\n1;2"));
	}
	
	@Test
	void testAddWithNegativeNumberException() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			stringCalculator.Add("-1,1");
		});
		String expectedMessage = "negatives not allowed";
		String actualMessage = exception.getMessage();
		System.out.println(actualMessage);
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testAddWithNegativeNumberException2() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			stringCalculator.Add("-1,1,-2");
		});
		String expectedMessage = "negatives not allowed";
		String actualMessage = exception.getMessage();
		System.out.println(actualMessage);
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testAddWithBiggerNumbers1000() {
		assertEquals(2, stringCalculator.Add("2,1001"));
	}
	
	@Test
	void testAddWithDelimiterOfAnyLength() {
		assertEquals(6, stringCalculator.Add("//[;;;]\n1;;;2;;;3"));
	}
	
	@Test
	void testAddWithDelimiterOfAnyLength2() {
		assertEquals(6, stringCalculator.Add("//[***]\n1***2***3"));
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("StringCalculator tests started...");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("StringCalculator tests completed.");
	}
}
