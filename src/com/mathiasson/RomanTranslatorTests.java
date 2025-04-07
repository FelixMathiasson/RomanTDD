package com.mathiasson;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RomanTranslatorTests {

	@Test
	void testRomanOne() // tests I
	{
		RomanTranslator rTranslator = new RomanTranslator();
		assertEquals(1, rTranslator.translateRomanToDecimal("I"));
	}
	
	@Test
	void testRomanTwo() //tests II
	{
		RomanTranslator rTranslator = new RomanTranslator();
		assertEquals(2, rTranslator.translateRomanToDecimal("II"));
	}
	
	@Test
	void testRomanV() //tests if the program can handle roman 5 "V"
	{
		RomanTranslator rTranslator = new RomanTranslator();
		assertEquals(5, rTranslator.translateRomanToDecimal("V"));
	}
	
	@Test
	void testCompositeRomanNumerals() // things like "IV" or "VI"
	{
		RomanTranslator rTranslator = new RomanTranslator();
		assertEquals(6, rTranslator.translateRomanToDecimal("VI"));
		assertEquals(4, rTranslator.translateRomanToDecimal("IV"));
	}
	
	@Test
	void testTensNumerals() // things like "IX" or "X" 
	{
		RomanTranslator rTranslator = new RomanTranslator();
		assertEquals(10, rTranslator.translateRomanToDecimal("X"));
		assertEquals(9, rTranslator.translateRomanToDecimal("IX"));
		assertEquals(15, rTranslator.translateRomanToDecimal("XV"));
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
	
	@Test
	void testBadInputData() //throw invalid input at the method
	{
	    RomanTranslator rTranslator = new RomanTranslator();
	    
	    //testing blank input
	    assertEquals(0, rTranslator.translateRomanToDecimal(""));
	    
	    //testing illegal characters
	    assertEquals(-1, rTranslator.translateRomanToDecimal("ABC"));
	    assertEquals(-1, rTranslator.translateRomanToDecimal(".,-"));


	}
}
