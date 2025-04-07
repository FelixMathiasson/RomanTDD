package com.mathiasson;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RomanTranslatorTests {

	@Test
	void testRomanOne() // tests I
	{
		RomanTranslator rTranslator = new RomanTranslator();
		int expected = 1;
		int result = rTranslator.translateRomanToDecimal("I");
		assertEquals(expected, result);
	}
	
	@Test
	void testRomanTwo() //tests II
	{
		RomanTranslator rTranslator = new RomanTranslator();
		int expected = 2;
		int result = rTranslator.translateRomanToDecimal("II");
		assertEquals(expected, result);
	}
	
	@Test
	void testRomanV() //tests if the program can handle roman 5 "V"
	{
		RomanTranslator rTranslator = new RomanTranslator();
		int expected = 5;
		int result = rTranslator.translateRomanToDecimal("V");
		assertEquals(expected, result);
	}
	
	@Test
	void testCompositeRomanNumerals() // things like "IV" or "VI"
	{
		RomanTranslator rTranslator = new RomanTranslator();
		int expected = 6;
		int result = rTranslator.translateRomanToDecimal("VI");
		assertEquals(expected, result);
		
		expected = 4;
		result = rTranslator.translateRomanToDecimal("IV");
		assertEquals(expected, result);
	}
	
	@Test
	void testTensNumerals() // things like "IX" or "X" 
	{
		RomanTranslator rTranslator = new RomanTranslator();
		int expected = 10;
		int result = rTranslator.translateRomanToDecimal("X");
		assertEquals(expected, result);
		
		expected = 9;
		result = rTranslator.translateRomanToDecimal("IX");
		assertEquals(expected, result);
		
		expected = 15;
		result = rTranslator.translateRomanToDecimal("XV");
		assertEquals(expected, result);
	}
	
	@Test
	void testRemainingRomanNumerals() // Tests numerals like "L", "C", "D", "M" and more
	{
	    RomanTranslator rTranslator = new RomanTranslator();

	    // Testing basic higher numerals
	    assertEquals(50, rTranslator.translateRomanToDecimal("L")); // L = 50
	    assertEquals(100, rTranslator.translateRomanToDecimal("C")); // C = 100
	    assertEquals(500, rTranslator.translateRomanToDecimal("D")); // D = 500
	    assertEquals(1000, rTranslator.translateRomanToDecimal("M")); // M = 1000

	    // Testing composite numerals with higher values
	    assertEquals(40, rTranslator.translateRomanToDecimal("XL")); // XL = 40 (50 - 10)
	    assertEquals(90, rTranslator.translateRomanToDecimal("XC")); // XC = 90 (100 - 10)
	    assertEquals(400, rTranslator.translateRomanToDecimal("CD")); // CD = 400 (500 - 100)
	    assertEquals(900, rTranslator.translateRomanToDecimal("CM")); // CM = 900 (1000 - 100)

	    // Testing complex combinations
	    assertEquals(1984, rTranslator.translateRomanToDecimal("MCMLXXXIV")); // 1984 = 1000 + 900 + 50 + 30 + 4
	    assertEquals(3999, rTranslator.translateRomanToDecimal("MMMCMXCIX")); // 3999 = 1000 + 1000 + 1000 + 900 + 90 + 9
	}
}
