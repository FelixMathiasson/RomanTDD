package com.mathiasson;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RomanTranslatorTests {

	@Test
	void testRomanOne() // tests I
	{
		RomanTranslator rt = new RomanTranslator();
		int expected = 1;
		int result = rt.translateRomanToDecimal("I");
		assertEquals(expected, result);
	}
	
	@Test
	void testRomanTwo() //tests II
	{
		RomanTranslator rt = new RomanTranslator();
		int expected = 2;
		int result = rt.translateRomanToDecimal("II");
		assertEquals(expected, result);
	}
	

}
