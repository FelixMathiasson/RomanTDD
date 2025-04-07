package com.mathiasson;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RomanTranslatorTests {

	@Test
	void testRomanOne() 
	{
		RomanTranslator rt = new RomanTranslator();
		int expected = 1;
		int result = rt.translateRomanToDecimal("I");
		assertEquals(expected, result);
	}

	

}
