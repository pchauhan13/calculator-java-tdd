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
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("StringCalculator tests started...");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("StringCalculator tests completed.");
	}
}
