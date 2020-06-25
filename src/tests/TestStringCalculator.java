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
		assertEquals(0, stringCalculator.Add("1"));
	}
	
	@Test
	void testAddWith2Numbers() {
		assertEquals(0, stringCalculator.Add("1,2"));
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
